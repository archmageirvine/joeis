package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046037 Numbers n for which floor((3/2)^n) is composite.
 * @author Sean A. Irvine
 */
public class A046037 extends Sequence1 {

  private int mN = 1;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(3);
      if (!mA.shiftRight(mN).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
