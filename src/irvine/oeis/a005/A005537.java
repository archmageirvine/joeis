package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005537.
 * @author Sean A. Irvine
 */
public class A005537 implements Sequence {

  private Z mA = Z.FOUR;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(3);
      }
      if (mA.add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
