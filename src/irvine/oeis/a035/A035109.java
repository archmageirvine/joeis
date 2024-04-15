package irvine.oeis.a035;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A035109 Numerators in expansion of a certain Dirichlet series.
 * @author Sean A. Irvine
 */
public class A035109 extends Sequence0 {

  private long mN = 0;

  private Z innerSum(final long n, final long d) {
    if (n == 1) {
      return Z.ONE;
    }
    final int m = Mobius.mobius(n / d);
    if (m == 0) {
      return Z.ZERO;
    }
    Z ecnt = Z.ZERO;
    for (final Z e : Jaguar.factor(d).divisors()) {
      if (e.isOdd()) {
        ecnt = ecnt.add(e);
      }
    }
    return Functions.SIGMA.z(d).multiply(ecnt).multiply(m);
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(innerSum(mN, d.longValue()));
    }
    return sum.divide(mN);
  }
}

