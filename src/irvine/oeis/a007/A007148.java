package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007148.
 * @author Sean A. Irvine
 */
public class A007148 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(dd.multiply2()).shiftLeft(mN / dd.intValue()));
    }
    sum = sum.divide(mN);
    sum = sum.add(Z.ONE.shiftLeft(mN));
    return sum.divide(4);
  }
}
