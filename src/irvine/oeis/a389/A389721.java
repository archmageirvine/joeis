package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389721 a(n) is the greatest prime &gt; a(n-1) obtained by inserting a single digit anywhere in its string of digits (including at the beginning or end), starting with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A389721 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String s = String.valueOf(mA);
    Z max = Z.ZERO;
    for (int k = 0; k <= s.length(); ++k) {
      for (int d = 0; d < 10; ++d) {
        final Z t = new Z(s.substring(0, k) + d + s.substring(k));
        if (t.compareTo(max) > 0 && t.isProbablePrime()) {
          max = t;
        }
      }
    }
    if (max.isZero()) {
      return null;
    }
    mA = max;
    return mA;
  }
}
