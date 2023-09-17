package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065842 a(1) = 1; a(2) = 2; a(3) = 3; a(n) is concatenation of a(n-3), a(n-2) and a(n-1); the digits on the right of the first 3 (if any) are then swapped with the digits on the left.
 * @author Sean A. Irvine
 */
public class A065842 extends Sequence1 {

  private String mA = null;
  private String mB = null;
  private String mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = "1";
        return Z.ONE;
      }
      if (mB == null) {
        mB = "2";
        return Z.TWO;
      }
      mC = "3";
      return Z.THREE;
    }
    final String s = mA + mB + mC;
    final int k = s.indexOf('3') + 1;
    final String t = k == s.length() ? s : s.substring(k) + s.substring(0, k);
    mA = mB;
    mB = mC;
    mC = t;
    return new Z(t);
  }
}

