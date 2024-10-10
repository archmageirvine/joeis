package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072534 a(1) = 2, a(2) = 3 and a(n) = the smallest prime of the form k*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A072534 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    Z t = mB;
    while (true) {
      final Z v = t.subtract(mA);
      if (v.isProbablePrime()) {
        mA = mB;
        mB = v;
        return v;
      }
      t = t.add(mB);
    }
  }
}
