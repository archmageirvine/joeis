package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005541 Numbers k such that 8*3^k - 1 is prime.
 * @author Sean A. Irvine
 */
public class A005541 extends Sequence1 {

  private Z mA = Z.EIGHT;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(3);
      }
      if (mA.subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
