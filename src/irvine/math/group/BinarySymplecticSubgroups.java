package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Irreducible subgroup classes in the binary symplectic group.
 * @author Gregory Morse
 */
final class BinarySymplecticSubgroups {

  private static final int DIMENSION = 6;
  private static final int ORDER = 512 * 3 * 15 * 63;

  static final class Subgroup {
    final long[] mGenerators;
    final int mOrder;
    final int mNormalizerOrder;
    private final BitSet mElements;
    private final int[] mOrders;

    private Subgroup(final long[] generators, final int order, final int normalizerOrder, final BitSet elements, final int[] orders) {
      mGenerators = generators;
      mOrder = order;
      mNormalizerOrder = normalizerOrder;
      mElements = elements;
      mOrders = orders;
    }
  }

  private final BinaryMatrixGroupCensus mAmbient = new BinaryMatrixGroupCensus(DIMENSION, ORDER, BinarySymplecticSeeds.generators());
  private final List<Subgroup> mClasses = new ArrayList<>();
  private final int[] mOrder = new int[ORDER];

  BinarySymplecticSubgroups() {
    mOrder[0] = 1;
    mClasses.add(new Subgroup(BinarySymplecticSeeds.generators(), ORDER, ORDER, null, null));
    for (final BinarySymplecticSeeds.Maximal maximal : BinarySymplecticSeeds.irreducibleMaximals()) {
      enumerate(maximal);
    }
  }

  private int order(final int element) {
    if (mOrder[element] == 0) {
      int k = 1;
      for (int y = element; y != 0; y = mAmbient.multiply(y, element)) {
        ++k;
      }
      mOrder[element] = k;
    }
    return mOrder[element];
  }

  private boolean containsConjugate(final BitSet target, final int[] generators, final int a) {
    final int inverse = mAmbient.inverse(a);
    for (final int g : generators) {
      if (!target.get(mAmbient.multiply(mAmbient.multiply(a, g), inverse))) {
        return false;
      }
    }
    return true;
  }

  private boolean conjugate(final BitSet target, final int[] generators) {
    for (int a = 0; a < ORDER; ++a) {
      if (containsConjugate(target, generators, a)) {
        return true;
      }
    }
    return false;
  }

  private int normalizer(final BitSet subgroup, final int[] generators) {
    int size = 0;
    for (int a = 0; a < ORDER; ++a) {
      if (containsConjugate(subgroup, generators, a)) {
        ++size;
      }
    }
    return size;
  }

  private void enumerate(final BinarySymplecticSeeds.Maximal maximal) {
    final BinaryMatrixGroupCensus local = new BinaryMatrixGroupCensus(DIMENSION, maximal.mOrder, maximal.mGenerators);
    final BinaryParabolicSubgroups census = local.subgroups();
    for (final BinaryParabolicSubgroups.Entry h : census.mRepresentatives) {
      final long[] matrices = local.matrices(h.mGenerators);
      if (!BinaryWreathSubgroups.irreducible(matrices)) {
        continue;
      }
      final int[] elements = Arrays.stream(h.mElements).map(x -> mAmbient.index(local.matrix(x))).toArray();
      final int max = Arrays.stream(elements).map(this::order).max().orElseThrow();
      final int[] orders = new int[max + 1];
      for (final int x : elements) {
        ++orders[order(x)];
      }
      // Test larger orders first to reject an incompatible image sooner.
      final int[] generators = Arrays.stream(matrices).mapToObj(g -> mAmbient.index(g))
        .sorted((a, b) -> Integer.compare(order(b), order(a))).mapToInt(Integer::intValue).toArray();
      boolean found = false;
      for (final Subgroup group : mClasses) {
        if (group.mOrder == h.mOrder && Arrays.equals(group.mOrders, orders) && conjugate(group.mElements, generators)) {
          found = true;
          break;
        }
      }
      if (!found) {
        final BitSet subgroup = new BitSet(ORDER);
        for (final int element : elements) {
          subgroup.set(element);
        }
        final int normalizer = normalizer(subgroup, generators);
        if (normalizer < h.mOrder || normalizer % h.mOrder != 0 || ORDER % normalizer != 0) {
          throw new IllegalStateException("Wrong ambient symplectic normalizer");
        }
        if (BinaryAlternatingForms.forms(matrices).isEmpty()) {
          throw new IllegalStateException("Missing invariant nondegenerate alternating form");
        }
        mClasses.add(new Subgroup(matrices, h.mOrder, normalizer, subgroup, orders));
      }
    }
  }

  List<Subgroup> classes() {
    return mClasses;
  }

  private int locate(final long[] generators, final int requiredOrder) {
    if (requiredOrder == ORDER) {
      return 0;
    }
    final int[] elements = mAmbient.subgroup(generators, requiredOrder);
    final int[] orders = new int[Arrays.stream(elements).map(this::order).max().orElseThrow() + 1];
    for (final int x : elements) {
      ++orders[order(x)];
    }
    final int[] indices = Arrays.stream(generators).mapToObj(mAmbient::index)
      .sorted((a, b) -> Integer.compare(order(b), order(a))).mapToInt(Integer::intValue).toArray();
    for (int i = 1; i < mClasses.size(); ++i) {
      final Subgroup other = mClasses.get(i);
      if (other.mOrder == requiredOrder && Arrays.equals(other.mOrders, orders) && conjugate(other.mElements, indices)) {
        return i;
      }
    }
    throw new IllegalStateException("Unknown symplectic conjugacy class");
  }

  private static long product(final long a, final long b) {
    return BinaryLinearActions.multiply(a, b, DIMENSION);
  }

  long[] ambientCounts(final BinaryWreathSubgroups wreath) {
    final long ambient = LinearGroupOrder.general(DIMENSION, Z.TWO).longValueExact();
    final int standard = BinaryAlternatingForms.forms(BinarySymplecticSeeds.generators()).get(0);
    final long inverseStandard = BinaryLinearActions.inverse(BinaryAlternatingForms.basis(standard), DIMENSION);
    long classes = 0;
    long total = 0;
    Q incidence = Q.ZERO;
    final BitSet seen = new BitSet();
    for (int i = 0; i < mClasses.size(); ++i) {
      final Subgroup subgroup = mClasses.get(i);
      final long[] gens = subgroup.mGenerators;
      if (wreath.decompositions(gens) != 0 || (3 * 63 * 56) % subgroup.mOrder == 0
        && !BinaryNormalizedFields.cubic(mAmbient.subgroup(gens, subgroup.mOrder),
          Arrays.stream(gens).mapToInt(mAmbient::index).toArray(), 0, mAmbient::multiply, mAmbient::matrix).isEmpty()) {
        continue;
      }
      final List<Integer> forms = BinaryAlternatingForms.forms(gens);
      incidence = incidence.add(new Q(ORDER / subgroup.mNormalizerOrder, forms.size()));
      if (!seen.get(i)) {
        int stabilizers = 0;
        for (final int form : forms) {
          final long change = product(BinaryAlternatingForms.basis(form), inverseStandard);
          final long inverse = BinaryLinearActions.inverse(change, DIMENSION);
          final int j = form == standard ? i : locate(Arrays.stream(gens).map(g -> product(product(inverse, g), change)).toArray(), subgroup.mOrder);
          seen.set(j);
          stabilizers += i == j ? 1 : 0;
        }
        final long normalizer = (long) subgroup.mNormalizerOrder * stabilizers;
        if (normalizer == 0 || ambient % normalizer != 0) {
          throw new IllegalStateException("Wrong general linear normalizer for symplectic subgroup");
        }
        ++classes;
        total = Math.addExact(total, ambient / normalizer);
      }
    }
    if (!incidence.multiply(ambient / ORDER).equals(new Q(total))) {
      throw new IllegalStateException("Symplectic incidence and class counts disagree");
    }
    return new long[] {classes, total};
  }
}
