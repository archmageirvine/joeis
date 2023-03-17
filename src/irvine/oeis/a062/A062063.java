package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062063 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.TWO;
        return Z.TWO;
      }
      if (mC == null) {
        mC = Z.THREE;
        return Z.THREE;
      }
      mD = Z.FIVE;
      return Z.FIVE;
    }
    Z t = mD;
    while (true) {
      t = t.add(1);
      if (t.gcd(mD).equals(Z.ONE) && t.gcd(mC).equals(Z.ONE) && t.gcd(mB).equals(Z.ONE) && t.gcd(mA).equals(Z.ONE)) {
        mA = mB;
        mB = mC;
        mC = mD;
        mD = t;
        return t;
      }
    }
  }
}

