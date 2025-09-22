package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A007426 d_4(n), or tau_4(n), the number of ordered factorizations of n as n = rstu.
 * @author Sean A. Irvine
 */
public class A007426 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      for (final Z e : Jaguar.factor(d).divisors()) {
        sum = sum.add(Functions.SIGMA0.z(e));
      }
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      for (final Z e : Jaguar.factor(d).divisors()) {
        sum = sum.add(Functions.SIGMA0.z(e));
      }
    }
    return sum;
  }

}
