package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.polynomial.HararyMultiply;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001325 Number of equivalence classes of 3-valued Post functions of n variables under action of semi-direct product of symmetric group S_n and complementing group D(n,3).
 * @author Sean A. Irvine
 */
public class A001325 extends Sequence1 {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  private static int bigGPrime(final int m, final int t2) {
    assert (t2 & 1) == 0;
    final int t = t2 / 2;
    final Z mm = Z.valueOf(m);
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(t2).divisors()) {
      final int d = dd.intValue();
      if (t % d != 0) {
        sum = sum.add(mm.pow(d / 2).subtract(m & 1).multiply(Functions.MOBIUS.i((long) (t2 / d))));
      }
    }
    return sum.divide(t2).intValueExact();
  }

  private static MultivariateMonomial mm2(final int m, final int i) {
    final MultivariateMonomial mm = new MultivariateMonomial();
    mm.setCoefficient(Q.ONE);
    mm.add(1, m & 1);
    for (final Z dd : Jaguar.factor(2L * i).divisors()) {
      final int d = dd.intValueExact();
      if (i % d != 0) {
        mm.add(d, bigGPrime(m, d));
      }
    }
    return mm;
  }

  static CycleIndex mmci(final int m, final int i) {
    return new CycleIndex("I", ExtendedSymmetricGroupCycleIndex.mm(m, i), mm2(m, i));
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

  private static Q period(final int[] j) {
    Z d = Z.ONE;
    for (int i = 1; i < j.length; ++i) {
      if (j[i] > 0) {
        d = d.multiply(Functions.FACTORIAL.z(j[i]).multiply(Z.valueOf(2L * i).pow(j[i])));
      }
    }
    return new Q(Z.ONE, d);
  }


  static CycleIndex extendedSCrossDCycleIndex(final int n, final int m) {
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

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return extendedSCrossDCycleIndex(mN, 3).eval(3).toZ();
  }
}
