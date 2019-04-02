package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002041 Expansion of x/((1-x)(1-4x^2)(1-5x)).
 * @author Sean A. Irvine
 */
public class A002041 implements Sequence {

  private boolean mEven = false;
  private Z mA = Z.valueOf(75);
  private Z mB = Z.valueOf(16);
  private Z mC = Z.valueOf(80);

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      mB = mB.shiftLeft(2);
    } else {
      mC = mC.shiftLeft(2);
    }
    mA = mA.multiply(5);
    return mA.subtract(mB).subtract(mC).add(21).divide(252);
  }
}
