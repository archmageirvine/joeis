package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007425 d_3(n), or tau_3(n), the number of ordered factorizations of n as n = r s t.
 * @author Sean A. Irvine
 */
public class A007425 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.SIGMA0.z(d));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(Functions.SIGMA0.z(d));
    }
    return sum;
  }

}
