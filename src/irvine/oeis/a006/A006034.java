package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006034 Numbers n such that (17^n-1)/16 is prime.
 * @author Sean A. Irvine
 */
public class A006034 extends Sequence1 {

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

