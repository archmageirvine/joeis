package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067599.
 * @author Sean A. Irvine
 */
public class A067672 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (mT.multiply(9).shiftRight(++mN + 2).shiftLeft(2).equals(mT.shiftRight(mN).multiply(9))) {
        return Z.valueOf(mN);
      }
    }
  }
}

