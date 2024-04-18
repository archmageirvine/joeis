package irvine.math.polynomial;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Cycle index for <code>S_n^{(m)}</code>.
 * @author Sean A. Irvine
 */
public final class ExtendedSymmetricGroupCycleIndex {

  private ExtendedSymmetricGroupCycleIndex() { }

  // Needed for some OEIS sequences defined in "On the Cycle Index of a Product of Permutation Groups",
  // by Harrison and High

  private static int g(final int m, final int i, final int s) {
    if (i % s == 0) {
      final Z mm = Z.valueOf(m);
      Z sum = Z.ZERO;
      for (final Z d : Jaguar.factor(s).divisors()) {
        sum = sum.add(mm.pow(d).multiply(Functions.MOBIUS.i((long) (s / d.intValue()))));
      }
      return sum.divide(s).intValueExact();
    } else {
      return 0;
    }
  }

  /**
   * Construct a particular multivariate monomial term.
   * @param m order
   * @param i index
   * @return multivariate monomial
   */
  public static MultivariateMonomial mm(final int m, final int i) {
    final MultivariateMonomial mm = new MultivariateMonomial();
    mm.setCoefficient(Q.ONE);
    for (final Z dd : Jaguar.factor(i).divisors()) {
      final int d = dd.intValue();
      mm.add(d, g(m, i, d));
    }
    return mm;
  }

  static CycleIndex mmci(final int m, final int i) {
    return new CycleIndex("I", mm(m, i));
  }

  private static CycleIndex mmcip(final int m, final int i, final int ji) {
    assert ji >= 1;
    final CycleIndex c = mmci(m, i);
    CycleIndex res = c;
    for (int k = 1 ; k < ji; ++k) {
      res = res.op(HararyMultiply.OP, c);
    }
    return res;
  }

  private static CycleIndex cross(final int m, final int[] j) {
    CycleIndex res = CycleIndex.ONE;
    for (int i = 1; i < j.length; ++i) {
      if (j[i] > 0) {
        res = res.op(HararyMultiply.OP, mmcip(m, i, j[i]));
      }
    }
    return res;
  }

  static Q period(final int[] j) {
    Z d = Z.ONE;
    for (int i = 1; i < j.length; ++i) {
      if (j[i] > 0) {
        d = d.multiply(MemoryFactorial.SINGLETON.factorial(j[i]).multiply(Z.valueOf(i).pow(j[i])));
      }
    }
    return new Q(Z.ONE, d);
  }


  /**
   * Construct the cycle index for the symmetric group <code>S_n^{(m)}</code>.
   * @param n order of symmetric group
   * @param m dimensions
   * @return cycle index
   */
  public static CycleIndex extendedSymmetricGroupCycleIndex(final int n, final int m) {
    final CycleIndex res = new CycleIndex();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    final int[] j = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      final CycleIndex cross = cross(m, j);
      cross.multiply(period(j));
      res.add(cross);
    }
    res.setName("S_{" + n + "}^{(" + m + ")}");
    return res;
  }
}
