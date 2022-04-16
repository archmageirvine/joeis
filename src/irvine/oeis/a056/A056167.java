package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056167 Numbers k such that k! is not divisible by the square of (f+1)!, where f = floor(k/2).
 * @author Sean A. Irvine
 */
public class A056167 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;
  private Z mG = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if ((mN & 1) == 0) {
        mG = mG.multiply(mN / 2 + 1).multiply(mN / 2 + 1);
      }
      if (!mF.mod(mG).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
