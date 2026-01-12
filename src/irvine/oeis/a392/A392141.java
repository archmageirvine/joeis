package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392141 a(0) = 1 and a(1) = 2, then each subsequent term is obtained by multiplying the two previous terms and then deleting repeated digits, keeping only the first occurrence of each digit.
 * @author Sean A. Irvine
 */
public class A392141 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final String t = mA.multiply(mB).toString();
    int syn = 0;
    Z res = Z.ZERO;
    for (int k = 0; k < t.length(); ++k) {
      final int v = t.charAt(k) - '0';
      if ((syn & (1 << v)) == 0) {
        syn |= 1 << v;
        res = res.multiply(10).add(v);
      }
    }
    mA = mB;
    mB = res;
    return mB;
  }
}

