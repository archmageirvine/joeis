package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058781 Numbers k such that k^2 * 2^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A058781 extends Sequence1 {

  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf((long) ++mN * mN).shiftLeft(mN).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
