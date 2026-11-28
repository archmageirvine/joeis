package irvine.math.group;

import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Ambient fusion of the irreducible subgroups normalizing a quadratic field.
 * @author Gregory Morse
 */
final class BinarySemilinear4Subgroups {

  private static final int DIMENSION = 6;
  private static final int ORDER = 2 * 63 * 60 * 48;
  private final BinaryMatrixGroupCensus mGroup = new BinaryMatrixGroupCensus(DIMENSION, ORDER, BinaryMatrixGroupCensus.semilinearFourGenerators());

  private static long product(final long a, final long b) {
    return BinaryLinearActions.multiply(a, b, DIMENSION);
  }

  long[] ambientCounts(final BinaryWreathSubgroups wreath) {
    return ambientCounts(wreath, mGroup, new BinaryProjectiveSubgroups(mGroup).subgroups());
  }

  static long[] ambientCounts(final BinaryWreathSubgroups wreath, final BinaryMatrixGroupCensus group, final BinaryParabolicSubgroups census) {
    final long ambient = LinearGroupOrder.general(DIMENSION, Z.TWO).longValueExact();
    long classes = 0;
    long total = 0;
    Q incidence = Q.ZERO;
    final BitSet seen = new BitSet();
    for (final BinaryParabolicSubgroups.Entry subgroup : census.mRepresentatives) {
      final long[] gens = group.matrices(subgroup.mGenerators);
      if (!BinaryWreathSubgroups.irreducible(gens) || wreath.decompositions(gens) != 0 || !BinaryAlternatingForms.forms(gens).isEmpty()
        || (3 * 63 * 56) % subgroup.mOrder == 0
        && !BinaryNormalizedFields.cubic(subgroup.mElements == null ? group.subgroup(gens, subgroup.mOrder) : subgroup.mElements,
          subgroup.mGenerators, 0, group::multiply, group::matrix).isEmpty()) {
        continue;
      }
      final List<Long> fields = BinaryNormalizedFields.quadratic(gens);
      if (fields.isEmpty()) {
        throw new IllegalStateException("Missing standard quadratic field");
      }
      incidence = incidence.add(new Q(subgroup.mClassSize, fields.size()));
      if (!seen.get(subgroup.mIndex)) {
        int stabilizers = 0;
        for (final long field : fields) {
          final long change = BinaryNormalizedFields.basis(field, 2);
          final long inverse = BinaryLinearActions.inverse(change, DIMENSION);
          final long[] conjugate = Arrays.stream(gens).map(g -> product(product(inverse, g), change)).toArray();
          final int j = census.locate(group.subgroup(conjugate, subgroup.mOrder)).mEntry.mIndex;
          seen.set(j);
          stabilizers += subgroup.mIndex == j ? 1 : 0;
        }
        final long normalizer = (long) (ORDER / subgroup.mClassSize) * stabilizers;
        if (normalizer == 0 || ambient % normalizer != 0) {
          throw new IllegalStateException("Wrong general linear normalizer for quadratic semilinear subgroup");
        }
        ++classes;
        total = Math.addExact(total, ambient / normalizer);
      }
    }
    if (!incidence.multiply(ambient / ORDER).equals(new Q(total))) {
      throw new IllegalStateException("Quadratic semilinear incidence and class counts disagree");
    }
    return new long[] {classes, total};
  }
}
