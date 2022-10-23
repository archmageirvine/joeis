package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034925 Numbers n such that 89^n-88 is prime.
 * @author Sean A. Irvine
 */
public class A034925 extends Sequence1 {

  private Z mT = Z.valueOf(7921);
  private int mN = 2;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(89);
      ++mN;
      if (mT.subtract(88).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
