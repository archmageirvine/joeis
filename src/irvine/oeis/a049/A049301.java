package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049301 Numbers n such that n is a substring of 3^n.
 * @author Sean A. Irvine
 */
public class A049301 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (mT.toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
