package irvine.math.group;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Binomial;

/**
 * Irreducible subgroups meeting the block-swapping coset of GL(3,2) wr C2.
 * @author Gregory Morse
 */
final class BinaryWreathSubgroups {

  private static final int BLOCK = 3;
  private static final int DIMENSION = 6;
  private static final int SHIFT = BLOCK * BLOCK;
  private static final int MASK = (1 << SHIFT) - 1;
  private static final int OUTSIDE = 1 << (2 * SHIFT);
  private final BinaryParabolicSubgroups mBase = BinaryParabolicSubgroups.project(BLOCK, BLOCK);
  private final List<int[]> mSpaces = BinaryLinearActions.spaces(DIMENSION, BLOCK);
  private final Map<BigInteger, Integer> mSpaceIndex = new HashMap<>();
  private final List<Group> mIrreducibles = new ArrayList<>();

  static final class Group {
    final long[] mGenerators;
    final int mOrder;
    final int mWreathNormalizer;
    final int mDecompositions;

    private Group(final long[] generators, final int order, final int wreathNormalizer, final int decompositions) {
      mGenerators = generators;
      mOrder = order;
      mWreathNormalizer = wreathNormalizer;
      mDecompositions = decompositions;
    }
  }

  BinaryWreathSubgroups() {
    for (int i = 0; i < mSpaces.size(); ++i) {
      mSpaceIndex.put(BinarySplitSubgroups.key(mSpaces.get(i)), i);
    }
    final List<int[]> proper = new ArrayList<>();
    proper.addAll(BinaryLinearActions.spaces(BLOCK, 1));
    proper.addAll(BinaryLinearActions.spaces(BLOCK, 2));
    for (final BinaryParabolicSubgroups.Entry kernel : mBase.mRepresentatives) {
      final long[] first = Arrays.stream(kernel.mGenerators).mapToLong(g -> g >>> SHIFT).toArray();
      final long[] second = Arrays.stream(kernel.mGenerators).mapToLong(g -> g & MASK).toArray();
      if (proper.stream().anyMatch(s -> BinaryLinearActions.invariant(first, s) || BinaryLinearActions.invariant(second, s))) {
        // An invariant proper subspace in one block and its transported
        // copy in the other would be invariant under the extension.
        continue;
      }
      final BinaryParabolicSubgroups.Projection swapped = mBase.locate(Arrays.stream(kernel.mElements).map(BinaryWreathSubgroups::swap).toArray());
      if (swapped.mEntry.mIndex == kernel.mIndex) {
        extend(kernel, mBase.inverse(swapped.mTransport) | OUTSIDE);
      }
    }
  }

  private static int raw(final int x) {
    return x & (OUTSIDE - 1);
  }

  private static int swap(final int element) {
    return ((element & MASK) << SHIFT) | (element >>> SHIFT);
  }

  private int multiply(final int x, final int y) {
    return mBase.multiply(raw(x), (x & OUTSIDE) == 0 ? raw(y) : swap(raw(y))) | ((x ^ y) & OUTSIDE);
  }

  private int inverse(final int x) {
    final int inverse = mBase.inverse(raw(x));
    return (x & OUTSIDE) == 0 ? inverse : swap(inverse) | OUTSIDE;
  }

  private long matrix(final int element) {
    long result = 0;
    for (int j = 0; j < DIMENSION; ++j) {
      final int i = (element & OUTSIDE) == 0 ? j : (j + BLOCK) % DIMENSION;
      result |= (long) mBase.point(raw(element), 1 << i) << (DIMENSION * j);
    }
    return result;
  }

  private Set<Integer> baseNormalizer(final BinaryParabolicSubgroups.Entry h) {
    final Set<Integer> set = new LinkedHashSet<>();
    final List<Integer> queue = new ArrayList<>();
    set.add(mBase.mIdentity);
    queue.add(mBase.mIdentity);
    for (int i = 0; i < queue.size(); ++i) {
      for (final int g : h.mNormalizer) {
        final int x = mBase.multiply(queue.get(i), g);
        if (set.add(x)) {
          queue.add(x);
        }
      }
    }
    if (mBase.order() / h.mClassSize != set.size()) {
      throw new IllegalStateException("Wrong base normalizer order");
    }
    return set;
  }

  private void extend(final BinaryParabolicSubgroups.Entry h, final int outside) {
    final Set<Integer> base = baseNormalizer(h);
    final Map<Integer, Integer> labels = new HashMap<>();
    final List<Integer> reps = new ArrayList<>();
    for (final int g : base) {
      final int x = multiply(g, outside);
      if (!labels.containsKey(x) && Arrays.binarySearch(h.mElements, multiply(x, x)) >= 0) {
        for (final int y : h.mElements) {
          labels.put(multiply(y, x), reps.size());
        }
        reps.add(x);
      }
    }
    final int[] normalizer = Arrays.copyOf(h.mNormalizer, h.mNormalizer.length + 1);
    normalizer[h.mNormalizer.length] = outside;
    final int[] inverses = Arrays.stream(normalizer).map(this::inverse).toArray();
    final BitSet seen = new BitSet(reps.size());
    final int[] orbit = new int[reps.size()];
    for (int i = 0; i < reps.size(); ++i) {
      if (seen.get(i)) {
        continue;
      }
      orbit[0] = i;
      seen.set(i);
      int end = 1;
      for (int j = 0; j < end; ++j) {
        for (int k = 0; k < normalizer.length; ++k) {
          final int x = multiply(multiply(normalizer[k], reps.get(orbit[j])), inverses[k]);
          final Integer label = labels.get(x);
          if (label == null) {
            throw new IllegalStateException("Conjugated outside coset was not enumerated");
          }
          if (!seen.get(label)) {
            seen.set(label);
            orbit[end++] = label;
          }
        }
      }
      if ((2 * base.size()) % end != 0) {
        throw new IllegalStateException("Nonintegral wreath normalizer");
      }
      final long[] generators = new long[h.mGenerators.length + 1];
      for (int k = 0; k < h.mGenerators.length; ++k) {
        generators[k] = matrix(h.mGenerators[k]);
      }
      generators[h.mGenerators.length] = matrix(reps.get(i));
      if (irreducible(generators)) {
        if (new BinaryStrongChain(DIMENSION, generators).order() != 2L * h.mOrder) {
          throw new IllegalStateException("Wrong generated wreath subgroup order");
        }
        mIrreducibles.add(new Group(generators, 2 * h.mOrder, 2 * base.size() / end, decompositions(generators)));
      }
    }
  }

  static boolean irreducible(final long[] generators) {
    final int[] orbit = new int[DIMENSION];
    for (int v = 1; v < (1 << DIMENSION); ++v) {
      final int[] basis = new int[DIMENSION];
      BinarySplitSubgroups.insert(basis, v);
      orbit[0] = v;
      int end = 1;
      for (int j = 0; j < end && end < DIMENSION; ++j) {
        for (final long g : generators) {
          final int x = BinarySplitSubgroups.reduce(basis, BinaryLinearActions.apply(g, orbit[j], DIMENSION));
          if (x != 0) {
            BinarySplitSubgroups.insert(basis, x);
            orbit[end++] = x;
            if (end == DIMENSION) {
              break;
            }
          }
        }
      }
      if (end < DIMENSION) {
        return false;
      }
    }
    return true;
  }

  int decompositions(final long[] generators) {
    final int[][] actions = new int[generators.length][mSpaces.size()];
    for (int i = 0; i < actions.length; ++i) {
      for (int j = 0; j < mSpaces.size(); ++j) {
        final int[] image = new int[DIMENSION];
        for (final int x : mSpaces.get(j)) {
          BinarySplitSubgroups.insert(image, BinaryLinearActions.apply(generators[i], x, DIMENSION));
        }
        actions[i][j] = mSpaceIndex.get(BinarySplitSubgroups.key(image));
      }
    }
    int count = 0;
    for (int i = 0; i < mSpaces.size(); ++i) {
      int other = i;
      for (final int[] action : actions) {
        if (action[i] != i) {
          other = action[i];
          break;
        }
      }
      if (other <= i) {
        continue;
      }
      final int first = i;
      final int second = other;
      if (Arrays.stream(actions).allMatch(action -> (action[first] == first && action[second] == second) || (action[first] == second && action[second] == first))) {
        final int[] space = mSpaces.get(i).clone();
        for (final int x : mSpaces.get(second)) {
          BinarySplitSubgroups.insert(space, x);
        }
        if (Arrays.stream(space).allMatch(x -> x != 0)) {
          ++count;
        }
      }
    }
    return count;
  }

  List<Group> classes() {
    return mIrreducibles;
  }

  long total() {
    Q total = Q.ZERO;
    for (final Group h : mIrreducibles) {
      if (h.mDecompositions == 0 || (2 * mBase.order()) % h.mWreathNormalizer != 0) {
        throw new IllegalStateException("Missing compatible decomposition");
      }
      total = total.add(new Q(2L * mBase.order() / h.mWreathNormalizer, h.mDecompositions));
    }
    final Q count = total.multiply(Binomial.gaussianBinomial(DIMENSION, BLOCK, 2).shiftLeft(SHIFT - 1));
    if (!count.isInteger()) {
      throw new IllegalStateException("Nonintegral wreath incidence count");
    }
    return count.toZ().longValueExact();
  }
}
