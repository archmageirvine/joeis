package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005541.
 * @author Sean A. Irvine
 */
public class A005541 implements Sequence {

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
