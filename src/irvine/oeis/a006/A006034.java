package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006034.
 * @author Sean A. Irvine
 */
public class A006034 implements Sequence {

  private Z mA = Z.valueOf(289);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN++;
      mA = mA.multiply(17);
      if (mA.subtract(1).divide(16).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

