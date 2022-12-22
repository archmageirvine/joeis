package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058829 Numbers k such that 6^k - k is prime.
 * @author Sean A. Irvine
 */
public class A058829 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA = mA.multiply(6);
      if (mA.subtract(++mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
