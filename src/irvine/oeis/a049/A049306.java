package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049306 Numbers n such that n is a substring of 8^n.
 * @author Sean A. Irvine
 */
public class A049306 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(8);
      if (mT.toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
