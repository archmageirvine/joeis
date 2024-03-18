package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068827 a(1) = 2; for n &gt; 1, a(n) is the smallest prime &gt; a(n-1) such that each successive digit in the concatenation of terms (that does not follow 9) is greater than the previous digit.
 * @author Sean A. Irvine
 */
public class A068827 extends A000040 {

  private long mPrev = 9;

  private boolean is(final Z p) {
    final String s = p.toString();
    long prev = mPrev;
    for (int k = 0; k < s.length(); ++k) {
      final int d = s.charAt(k) - '0';
      if (prev == 9) {
        if (d == 9 || d == 0) {
          return false;
        }
      } else if (d <= prev) {
        return false;
      }
      prev = d;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        mPrev = p.mod(10);
        return p;
      }
    }
  }
}
