package irvine.math.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Exact characteristic-polynomial census from a conjugacy inventory of a
 * quotient. Each representative is expanded over its entire normal subgroup.
 * The caller supplies an exhaustive quotient class inventory and the Gram
 * form of an integrally maximal group. Membership, normality, and total mass
 * are checked here; the class partition itself is input data.
 * @author Gregory Morse
 */
final class RationalClassInventory {

  static final class Lift {
    private final Q[][] mMatrix;
    private final Z mMultiplicity;

    Lift(final Q[][] matrix, final Z multiplicity) {
      mMatrix = matrix;
      mMultiplicity = multiplicity;
    }
  }

  private RationalClassInventory() { }

  // For finite integral matrix groups, reduction modulo 67 is faithful.
  private static int[] reduce(final Q[][] matrix, final int n) {
    if (matrix.length != n) {
      throw new IllegalArgumentException("Wrong matrix dimension");
    }
    final int[] a = new int[n * n];
    for (int i = 0; i < n; ++i) {
      if (matrix[i].length != n) {
        throw new IllegalArgumentException("Nonsquare matrix");
      }
      for (int j = 0; j < n; ++j) {
        final Q x = matrix[i][j];
        if (!x.den().isOne()) {
          throw new IllegalArgumentException("Nonintegral class inventory");
        }
        a[i * n + j] = RationalBlockSpectra.residue(x);
      }
    }
    return a;
  }

  private static String key(final int[] a) {
    final char[] s = new char[a.length];
    for (int i = 0; i < a.length; ++i) {
      s[i] = (char) a[i];
    }
    return new String(s);
  }

  static RationalBlockSpectra.SpectrumTable evaluate(final Q[][] form, final Q[][][] ambient, final Z order,
                                                      final int radicalOrder, final Q[][][] generators, final List<Lift> classes) {
    final int n = form.length;
    if (n <= 0 || n > 31 || radicalOrder <= 0 || order.mod(radicalOrder) != 0 || classes.isEmpty()
        || (long) radicalOrder * classes.size() > 90000) {
      throw new IllegalArgumentException("Invalid or oversized class inventory");
    }
    final List<Q[][]> matrices = new ArrayList<>();
    for (final Q[][] generator : generators) {
      matrices.add(generator);
    }
    for (final Lift lift : classes) {
      matrices.add(lift.mMatrix);
    }
    // Integral maximality identifies the ambient group with the full lattice
    // isometry group. Check membership by verifying the Gram identities.
    RationalGroupForms.checkInvariant(form, matrices.toArray(new Q[0][][]));
    final List<int[]> radical = new ArrayList<>();
    final Set<String> seen = new HashSet<>();
    final int[] id = new int[n * n];
    for (int i = 0; i < n; ++i) {
      id[i * (n + 1)] = 1;
    }
    radical.add(id);
    seen.add(key(id));
    final List<int[]> steps = new ArrayList<>();
    for (final Q[][] generator : generators) {
      steps.add(reduce(generator, n));
    }
    for (int i = 0; i < radical.size(); ++i) {
      for (final int[] step : steps) {
        final int[] x = RationalBlockSpectra.multiply(radical.get(i), step, n);
        if (seen.add(key(x))) {
          radical.add(x);
          if (radical.size() > radicalOrder) {
            throw new IllegalArgumentException("Normal subgroup exceeds its stated order");
          }
        }
      }
    }
    if (radical.size() != radicalOrder) {
      throw new IllegalArgumentException("Wrong normal subgroup order");
    }
    for (final Q[][] generator : ambient) {
      final int[] g = reduce(generator, n);
      final int[] inv = RationalBlockSpectra.inverse(g, n);
      for (final int[] r : steps) {
        if (!seen.contains(key(RationalBlockSpectra.multiply(RationalBlockSpectra.multiply(inv, r, n), g, n)))) {
          throw new IllegalArgumentException("Subgroup is not normal");
        }
      }
    }
    final Map<List<Integer>, Z> counts = new HashMap<>();
    final Z quotient = order.divide(radicalOrder);
    Z mass = Z.ZERO;
    final Set<String> previousLifts = new HashSet<>();
    for (final Lift record : classes) {
      final Z weight = record.mMultiplicity;
      if (weight.signum() <= 0 || !quotient.mod(weight).isZero()) {
        throw new IllegalArgumentException("Invalid quotient class size");
      }
      final int[] lift = reduce(record.mMatrix, n);
      // Conjugation gives a bijection of fibres over a quotient class.
      // Each of the weight fibres therefore contributes the same spectrum.
      for (final int[] r : radical) {
        final int[] x = RationalBlockSpectra.multiply(r, lift, n);
        if (previousLifts.contains(key(x))) {
          throw new IllegalArgumentException("Duplicate quotient coset");
        }
        counts.merge(RationalBlockSpectra.cyclotomicIndices(RationalBlockSpectra.traces(x, n)), weight, Z::add);
      }
      previousLifts.add(key(lift));
      mass = mass.add(weight);
    }
    if (!mass.equals(quotient)) {
      throw new IllegalArgumentException("Class sizes do not sum to the quotient order");
    }
    return new RationalBlockSpectra.SpectrumTable(n, order, counts);
  }
}
