package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026933 Self-convolution of array T given by A008288.
 * @author Sean A. Irvine
 */
public class A026933 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.valueOf(11);

  @Override
  public Z next() {
    if (++mN <= 2) {
      if (mN == 0) {
        return Z.ONE;
      } else if (mN == 1) {
        return Z.TWO;
      }
    } else {
      final Z t = mC.multiply(5 * mN - 3).add(mB.multiply(5 * mN - 2)).subtract(mA.multiply(mN - 1)).divide(mN);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
