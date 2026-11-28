package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Native Goursat decomposition when the second binary factor has dimension two.
 * @author Gregory Morse
 */
final class BinarySmallQuotientProjections {

  private BinarySmallQuotientProjections() { }

  private static final class Quotient {
    private final int[] mKernel;
    private final int[] mLabels = new int[16];
    private final int[] mReps;
    private final int[][] mTable;
    private final int[] mOrders;

    private Quotient(final BinaryParabolicSubgroups group, final int[] elements, final int[] kernel) {
      mKernel = kernel;
      Arrays.fill(mLabels, -1);
      mReps = new int[elements.length / kernel.length];
      mReps[0] = group.mIdentity;
      for (final int x : kernel) {
        mLabels[x] = 0;
      }
      int end = 1;
      for (final int x : elements) {
        if (mLabels[x] < 0) {
          for (final int y : kernel) {
            mLabels[group.multiply(x, y)] = end;
          }
          mReps[end++] = x;
        }
      }
      if (end != mReps.length) {
        throw new IllegalStateException("Invalid small normal quotient");
      }
      mTable = new int[end][end];
      mOrders = new int[end];
      for (int i = 0; i < end; ++i) {
        for (int j = 0; j < end; ++j) {
          mTable[i][j] = mLabels[group.multiply(mReps[i], mReps[j])];
        }
        int power = i;
        int order = 1;
        while (power != 0) {
          power = mTable[i][power];
          ++order;
        }
        mOrders[i] = order;
      }
    }
  }

  private static List<Quotient> quotients(final BinaryParabolicSubgroups group, final BinaryParabolicSubgroups.Entry subgroup) {
    final List<Quotient> result = new ArrayList<>();
    final int[] es = subgroup.mElements;
    final Set<Integer> sizes = new HashSet<>();
    for (int bits = 1; bits < (1 << es.length); ++bits) {
      int mask = 0;
      final int[] elements = new int[Integer.bitCount(bits)];
      int end = 0;
      for (int x = bits; x != 0; x &= x - 1) {
        final int element = es[Integer.numberOfTrailingZeros(x)];
        elements[end++] = element;
        mask |= 1 << element;
      }
      if ((mask & (1 << group.mIdentity)) == 0) {
        continue;
      }
      boolean valid = true;
      for (final int x : elements) {
        for (final int y : es) {
          if ((mask & (1 << group.conjugate(x, y))) == 0
            || (mask & (1 << y)) != 0 && (mask & (1 << group.multiply(x, y))) == 0) {
            valid = false;
            break;
          }
        }
        if (!valid) {
          break;
        }
      }
      if (valid) {
        if (!sizes.add(elements.length)) {
          throw new IllegalStateException("The small factor has two normal subgroups of one order");
        }
        result.add(new Quotient(group, es, elements));
      }
    }
    return result;
  }

  private static final class Domain {
    private final int[] mGenerators;
    private final int[] mOrders;
    private final int[][] mTransitions;
    private final int[] mPred;
    private final int[] mLetter;
    private final Map<Integer, Integer> mLabels = new HashMap<>();

    private Domain(final BinaryParabolicSubgroups group, final BinaryParabolicSubgroups.Entry subgroup) {
      mGenerators = subgroup.mGenerators;
      final int order = subgroup.mOrder;
      mTransitions = new int[order][mGenerators.length];
      mPred = new int[order];
      mLetter = new int[order];
      final int[] elements = new int[order];
      elements[0] = group.mIdentity;
      mLabels.put(elements[0], 0);
      int end = 1;
      for (int i = 0; i < end; ++i) {
        for (int j = 0; j < mGenerators.length; ++j) {
          final int product = group.multiply(elements[i], mGenerators[j]);
          final Integer label = mLabels.putIfAbsent(product, end);
          if (label == null) {
            elements[end] = product;
            mPred[end] = i;
            mLetter[end] = j;
            mTransitions[i][j] = end++;
          } else {
            mTransitions[i][j] = label;
          }
        }
      }
      if (end != order || mGenerators.length > 20) {
        throw new IllegalStateException("Wrong order or generator count of the domain");
      }
      mOrders = new int[mGenerators.length];
      for (int i = 0; i < mGenerators.length; ++i) {
        int v = mGenerators[i];
        int k = 1;
        for (; v != group.mIdentity; ++k) {
          v = group.multiply(v, mGenerators[i]);
        }
        mOrders[i] = k;
      }
    }

    private static int image(final long code, final int i) {
      return (int) (code >>> (3 * i)) & 7;
    }

    private int[] values(final Quotient quotient, final long code) {
      final int[] values = new int[mTransitions.length];
      for (int i = 1; i < values.length; ++i) {
        values[i] = quotient.mTable[values[mPred[i]]][image(code, mLetter[i])];
      }
      return values;
    }

    private void search(final Quotient q, final Set<Long> result, final int index, final long code) {
      if (index < mGenerators.length) {
        for (int y = 0; y < q.mTable.length; ++y) {
          if (mOrders[index] % q.mOrders[y] == 0) {
            search(q, result, index + 1, code | ((long) y << (3 * index)));
          }
        }
        return;
      }
      final int[] values = values(q, code);
      int reached = 0;
      for (int i = 0; i < values.length; ++i) {
        reached |= 1 << values[i];
        for (int j = 0; j < mGenerators.length; ++j) {
          if (q.mTable[values[i]][image(code, j)] != values[mTransitions[i][j]]) {
            return;
          }
        }
      }
      if (Integer.bitCount(reached) == q.mTable.length) {
        result.add(code);
      }
    }

    private Set<Long> epimorphisms(final Quotient q) {
      final Set<Long> result = new LinkedHashSet<>();
      if (q.mTable.length == 1) {
        result.add(0L);
      } else if (mTransitions.length % q.mTable.length == 0) {
        search(q, result, 0, 0);
      }
      return result;
    }
  }

  private static final class Law {
    private final int mConjugator;
    private final int[] mInput;
    private final int[] mOutput;

    private Law(final int conjugator, final int[] input, final int[] output) {
      mConjugator = conjugator;
      mInput = input;
      mOutput = output;
    }

    private long act(final int[] values) {
      long result = 0;
      for (int j = 0; j < mInput.length; ++j) {
        result |= (long) mOutput[values[mInput[j]]] << (3 * j);
      }
      return result;
    }
  }

  private static final class Fiber {
    private final Quotient mQuotient;
    private final Map<Long, BinaryParabolicSubgroups.Projection> mLifts = new HashMap<>();

    private Fiber(final Quotient quotient) {
      mQuotient = quotient;
    }
  }

  private static final class Locations {
    private final BinaryParabolicSubgroups mProduct;
    private final BinaryParabolicSubgroups mFirst;
    private final BinaryParabolicSubgroups mSecond;
    private final Map<Long, Fiber> mFibers = new HashMap<>();

    private Locations(final BinaryParabolicSubgroups product, final BinaryParabolicSubgroups first,
                      final BinaryParabolicSubgroups second) {
      mProduct = product;
      mFirst = first;
      mSecond = second;
    }

    private static long key(final BinaryParabolicSubgroups.Entry a, final BinaryParabolicSubgroups.Entry b, final int kernel) {
      return ((long) a.mIndex << 16) | ((long) b.mIndex << 8) | kernel;
    }

    private BinaryParabolicSubgroups.Projection locate(final int[] elements) {
      final BitSet as = new BitSet();
      final BitSet bs = new BitSet();
      int kernel = 0;
      for (final int g : elements) {
        final int a = g >>> 4;
        as.set(a);
        bs.set(g & 15);
        if (a == mFirst.mIdentity) {
          ++kernel;
        }
      }
      final BinaryParabolicSubgroups.Projection a = mFirst.locate(as.stream().toArray());
      final BinaryParabolicSubgroups.Projection b = mSecond.locate(bs.stream().toArray());
      final Fiber fiber = mFibers.get(key(a.mEntry, b.mEntry, kernel));
      if (fiber == null) {
        throw new IllegalStateException("Unknown quotient fiber");
      }
      long code = 0;
      final int secondInverse = mSecond.inverse(b.mTransport);
      for (int i = 0; i < a.mEntry.mGenerators.length; ++i) {
        final int g = mFirst.conjugate(a.mEntry.mGenerators[i], a.mTransport);
        int value = -1;
        for (final int element : elements) {
          if ((element >>> 4) == g) {
            value = fiber.mQuotient.mLabels[mSecond.conjugate(element & 15, secondInverse)];
            break;
          }
        }
        if (value < 0) {
          throw new IllegalStateException("Missing projection of a generator");
        }
        code |= (long) value << (3 * i);
      }
      final BinaryParabolicSubgroups.Projection root = fiber.mLifts.get(code);
      if (root == null || root.mEntry.mOrder != elements.length) {
        throw new IllegalStateException("Unknown quotient map");
      }
      return new BinaryParabolicSubgroups.Projection(root.mEntry,
        mProduct.multiply(mProduct.pair(a.mTransport, b.mTransport), root.mTransport));
    }
  }

  private static void fuse(final BinaryParabolicSubgroups product, final BinaryParabolicSubgroups first,
                           final BinaryParabolicSubgroups second, final BinaryParabolicSubgroups.Entry a,
                           final BinaryParabolicSubgroups.Entry b, final Domain domain, final Quotient quotient,
                           final Locations location) {
    final Set<Long> candidates = domain.epimorphisms(quotient);
    if (candidates.isEmpty()) {
      return;
    }
    final Fiber fiber = location == null ? null : new Fiber(quotient);
    if (fiber != null && location.mFibers.put(Locations.key(a, b, quotient.mKernel.length), fiber) != null) {
      throw new IllegalStateException("Duplicate quotient fiber");
    }
    final List<Law> laws = new ArrayList<>();
    final int[] outputs = new int[quotient.mTable.length];
    for (int i = 0; i < outputs.length; ++i) {
      outputs[i] = i;
    }
    for (final int x : a.mNormalizer) {
      final int inverse = first.inverse(x);
      final int[] input = Arrays.stream(a.mGenerators).map(g -> domain.mLabels.get(first.conjugate(g, inverse))).toArray();
      laws.add(new Law(product.pair(x, second.mIdentity), input, outputs));
    }
    final int[] inputs = Arrays.stream(a.mGenerators).map(g -> domain.mLabels.get(g)).toArray();
    for (final int y : b.mNormalizer) {
      final int[] output = Arrays.stream(quotient.mReps).map(x -> quotient.mLabels[second.conjugate(x, y)]).toArray();
      laws.add(new Law(product.pair(first.mIdentity, y), inputs, output));
    }
    final Set<Long> placed = new HashSet<>();
    for (final long root : candidates) {
      if (!placed.add(root)) {
        continue;
      }
      final List<Long> orbit = new ArrayList<>();
      final Map<Long, Integer> transports = new HashMap<>();
      final Set<Integer> stabilizer = new LinkedHashSet<>();
      orbit.add(root);
      transports.put(root, product.mIdentity);
      for (int i = 0; i < orbit.size(); ++i) {
        final long code = orbit.get(i);
        final int[] values = domain.values(quotient, code);
        for (final Law law : laws) {
          final long image = law.act(values);
          final int t = product.multiply(law.mConjugator, transports.get(code));
          final Integer old = transports.putIfAbsent(image, t);
          if (old == null) {
            if (!candidates.contains(image) || !placed.add(image)) {
              throw new IllegalStateException("No complete orbit of quotient maps");
            }
            orbit.add(image);
          } else {
            final int z = product.multiply(product.inverse(old), t);
            if (z != product.mIdentity) {
              stabilizer.add(z);
            }
          }
        }
      }
      final int stabilizingFactors = (first.order() / a.mClassSize) * (second.order() / b.mClassSize);
      if (stabilizingFactors % orbit.size() != 0) {
        throw new IllegalStateException("Quotient orbit size does not divide the stabilizer");
      }
      final List<Integer> generators = new ArrayList<>();
      for (final int v : quotient.mKernel) {
        if (v != second.mIdentity) {
          generators.add(product.pair(first.mIdentity, v));
        }
      }
      for (int i = 0; i < a.mGenerators.length; ++i) {
        generators.add(product.pair(a.mGenerators[i], quotient.mReps[Domain.image(root, i)]));
      }
      product.offerProduct(generators.stream().mapToInt(Integer::intValue).toArray(),
        stabilizer.stream().mapToInt(Integer::intValue).toArray(), a.mOrder * quotient.mKernel.length,
        stabilizingFactors / orbit.size());
      if (fiber != null) {
        final BinaryParabolicSubgroups.Entry entry = product.mRepresentatives.get(product.mRepresentatives.size() - 1);
        for (final Map.Entry<Long, Integer> tr : transports.entrySet()) {
          fiber.mLifts.put(tr.getKey(), new BinaryParabolicSubgroups.Projection(entry, tr.getValue()));
        }
      }
    }
  }

  static BinaryParabolicSubgroups irreducibleFour() {
    return product(true);
  }

  static BinaryParabolicSubgroups irreducibleTwo() {
    final BinaryParabolicSubgroups reversed = product(false);
    final BinaryParabolicSubgroups result = new BinaryParabolicSubgroups(2, 4, false);
    for (final BinaryParabolicSubgroups.Entry entry : reversed.mRepresentatives) {
      final int[] generators = Arrays.stream(entry.mGenerators).map(g -> result.pair(g & 15, g >>> 4)).toArray();
      final int[] normalizer = Arrays.stream(entry.mNormalizer).map(g -> result.pair(g & 15, g >>> 4)).toArray();
      result.offerProduct(generators, normalizer, entry.mOrder, reversed.order() / entry.mClassSize);
    }
    result.setLocator(elements -> {
      final int[] swapped = Arrays.stream(elements).map(x -> reversed.pair(x & 65535, x >>> 16)).toArray();
      final BinaryParabolicSubgroups.Projection root = reversed.locate(swapped);
      return new BinaryParabolicSubgroups.Projection(result.mRepresentatives.get(root.mEntry.mIndex),
        result.pair(root.mTransport & 15, root.mTransport >>> 4));
    });
    return result;
  }

  private static BinaryParabolicSubgroups product(final boolean irreducibleLarge) {
    final BinaryParabolicSubgroups product = new BinaryParabolicSubgroups(4, 2, false);
    final BinaryParabolicSubgroups first = BinaryParabolicSubgroups.small(4);
    final BinaryParabolicSubgroups second = BinaryParabolicSubgroups.small(2);
    final Locations locations = irreducibleLarge ? null : new Locations(product, first, second);
    if (locations != null) {
      product.setLocator(locations::locate);
    }
    final List<int[]> proper = new ArrayList<>();
    for (int i = 1; i < 4; ++i) {
      proper.addAll(BinaryLinearActions.spaces(4, i));
    }
    final List<int[]> lines = BinaryLinearActions.spaces(2, 1);
    for (final BinaryParabolicSubgroups.Entry a : first.mRepresentatives) {
      final long[] generators = Arrays.stream(a.mGenerators).mapToLong(x -> x).toArray();
      if (irreducibleLarge && proper.stream().anyMatch(s -> BinaryLinearActions.invariant(generators, s))) {
        continue;
      }
      final Domain domain = new Domain(first, a);
      for (final BinaryParabolicSubgroups.Entry b : second.mRepresentatives) {
        if (!irreducibleLarge) {
          final long[] small = Arrays.stream(b.mGenerators).mapToLong(x -> x).toArray();
          if (lines.stream().anyMatch(s -> BinaryLinearActions.invariant(small, s))) {
            continue;
          }
        }
        for (final Quotient quotient : quotients(second, b)) {
          fuse(product, first, second, a, b, domain, quotient, locations);
        }
      }
    }
    return product;
  }
}
