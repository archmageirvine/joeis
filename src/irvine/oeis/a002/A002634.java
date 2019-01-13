package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000183;

/**
 * A002634.
 * @author Sean A. Irvine
 */
public class A002634 extends A000183 {

  private Z mB1 = null;
  private Z mB2 = null;

  private long mAdd = -4;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z b0 = mB1;
    mB1 = mB2;
    mB2 = super.next();
    mAdd = -mAdd;
    final Z t;
    if (mA == null) {
      if (mD == null) {
        t = Z.valueOf(-2);
      } else if (mC == null) {
        t = Z.THREE;
      } else if (mB == null) {
        t = Z.ZERO;
      } else {
        t = Z.valueOf(25);
      }
    } else {
      t = mB2.subtract(mB1.multiply2()).add(b0).add(mD.multiply2()).add(mC.multiply2()).subtract(mB.multiply2()).add(mA).add(mAdd);
    }
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return mD;
  }
}
