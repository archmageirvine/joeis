package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034907 a(n) in base 10 is a(n-1) in base a(n-1).
 * @author Sean A. Irvine
 */
public class A034907 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.valueOf(11);
    } else {
      Z r = Z.ZERO;
      final String s = mA.toString();
      for (int k = 0; k < s.length(); ++k) {
        r = r.multiply(mA).add(s.charAt(k) - '0');
      }
      mA = r;
    }
    return mA;
  }
}
