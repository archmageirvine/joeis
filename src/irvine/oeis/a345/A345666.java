package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A345666 allocated for Eyal Gruss.
 * @author Sean A. Irvine
 */
public class A345666 extends A002808 {

  private Z mRecord = Z.ZERO;

  private Z largestPrimeSubstring(final String s) {
    Z max = Z.ZERO;
    for (int start = 0; start < s.length(); ++start) {
      for (int len = s.length() - start; len > 0; --len) {
        final Z t = new Z(s.substring(start, start + len));
        if (t.isProbablePrime()) {
          max = max.max(t);
          break;
        }
      }
    }
    return max;
  }

  protected Z select(final Z c, final Z p) {
    return c;
  }

  @Override
  public Z next() {
    while (true) {
      final Z composite = super.next();
      final Z max = largestPrimeSubstring(composite.toString());
      if (max.compareTo(mRecord) > 0) {
        mRecord = max;
        return select(composite, mRecord);
      }
    }
  }
}
