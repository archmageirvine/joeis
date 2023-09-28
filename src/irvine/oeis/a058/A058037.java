package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058037 Numbers k such that 3^k - k is prime.
 * @author Sean A. Irvine
 */
public class A058037 extends Sequence1 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;  // 1 is the only odd solution
    }
    while (true) {
      mA = mA.multiply(9);
      mN += 2;
      if (mA.subtract(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
