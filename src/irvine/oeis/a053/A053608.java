package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A053608 Numbers x=LCM(1,2,...,n) such that x^2 + 1 is prime.
 * @author Sean A. Irvine
 */
public class A053608 extends A003418 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z lcm = super.next();
      if (lcm.square().add(1).isProbablePrime() && !mPrev.equals(lcm)) {
        mPrev = lcm;
        return lcm;
      }
    }
  }
}
