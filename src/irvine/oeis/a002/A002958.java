package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002958.
 * @author Sean A. Irvine
 */
public class A002958 implements Sequence {

  private Z mN = Z.TWO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.multiply(25);
      mP = mP.add(1);
      if (mN.subtract(1).isProbablePrime()) {
        return mP;
      }
    }
  }
}
