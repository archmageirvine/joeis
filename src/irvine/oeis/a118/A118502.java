package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A118502 Numbers k that divide floor((4/3)^k).
 * @author Sean A. Irvine
 */
public class A118502 implements Sequence {

  private long mN = 0;
  private Z mNum = Z.ONE;
  private Z mDen = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mNum = mNum.shiftLeft(2);
      mDen = mDen.multiply(3);
      if (mNum.divide(mDen).mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

