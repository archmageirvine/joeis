package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058775 Numbers n such that n * 2^(n/2) - 1 is prime.
 * @author Sean A. Irvine
 */
public class A058775 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Z.valueOf(mN).shiftLeft(mN / 2).subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
