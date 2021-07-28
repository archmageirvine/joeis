package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049304 Numbers n such that n is a substring of 6^n.
 * @author Sean A. Irvine
 */
public class A049304 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(6);
      if (mT.toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
