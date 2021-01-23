package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002131 Sum of divisors d of n such that n/d is odd.
 * @author Sean A. Irvine
 */
public class A002131 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      if (!mN.divide(d).isEven()) {
        s = s.add(d);
      }
    }
    return s;
  }
}
