package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062062 Smallest increasing sequence where each term is coprime to preceding three terms.
 * @author Sean A. Irvine
 */
public class A062062 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.TWO;
        return Z.TWO;
      }
      mC = Z.THREE;
      return Z.THREE;
    }
    Z t = mC;
    while (true) {
      t = t.add(1);
      if (t.gcd(mC).equals(Z.ONE) && t.gcd(mB).equals(Z.ONE) && t.gcd(mA).equals(Z.ONE)) {
        mA = mB;
        mB = mC;
        mC = t;
        return t;
      }
    }
  }
}

