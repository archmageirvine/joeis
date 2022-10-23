package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037069 Smallest prime containing exactly n 8's.
 * @author Sean A. Irvine
 */
public class A037069 extends Sequence0 {

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String eights = StringUtils.rep('8', mN);
    // Try adding one last digit
    for (final char last : LAST) {
      final Z t = new Z(eights + last);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // At least two digits must be added
    // Try adding zero or one digit with an extra trailing digit
    for (int pos = 0; pos < eights.length(); ++pos) {
      for (char digit = '0'; digit <= '7'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = eights.substring(0, pos) + digit + eights.substring(pos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    // Try adding a digit 9
    for (int pos = eights.length(); pos > 0; --pos) {
      final String v = eights.substring(0, pos) + '9' + eights.substring(pos);
      for (final char last : LAST) {
        final Z t = new Z(v + last);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
