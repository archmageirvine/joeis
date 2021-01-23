package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A037053 Smallest prime containing exactly n 0's.
 * @author Sean A. Irvine
 */
public class A037053 implements Sequence {

  // Conjecture: at most 3 non-zero digits needed

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String zeros = StringUtils.rep('0', mN);
    // Try adding one digit to each end
    for (char first = '1'; first <= '9'; ++first) {
      for (final char last : LAST) {
        final Z t = new Z(first + zeros + last);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    // Try one digit at front, one at end, one in middle
    for (char first = '1'; first <= '9'; ++first) {
      final String u = first + zeros;
      for (int midPos = u.length(); midPos > 0; --midPos) {
        for (char mid = '1'; mid <= '9'; ++mid) {
          final String v = u.substring(0, midPos) + mid + u.substring(midPos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
