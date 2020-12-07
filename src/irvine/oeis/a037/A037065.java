package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A037065 Smallest prime containing exactly n 6's.
 * @author Sean A. Irvine
 */
public class A037065 implements Sequence {

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String sixes = StringUtils.rep('6', mN);
    // Try adding one last digit
    for (final char last : LAST) {
      final Z t = new Z(sixes + last);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // At least two digits must be added
    // Try adding zero or one digit with an extra trailing digit
    for (int pos = 0; pos < sixes.length(); ++pos) {
      for (char digit = '0'; digit <= '5'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = sixes.substring(0, pos) + digit + sixes.substring(pos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    // Try adding a digit 7 .. 9
    for (int pos = sixes.length(); pos > 0; --pos) {
      for (char digit = '7'; digit <= '9'; ++digit) {
        final String v = sixes.substring(0, pos) + digit + sixes.substring(pos);
        for (final char last : LAST) {
          final Z t = new Z(v + last);
          if (t.isProbablePrime()) {
            return t;
          }
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
