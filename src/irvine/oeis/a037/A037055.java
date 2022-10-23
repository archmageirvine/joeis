package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037055 Smallest prime containing exactly n 1's.
 * @author Sean A. Irvine
 */
public class A037055 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String ones = StringUtils.rep('1', mN);
    final Z easy = new Z(ones);
    if (easy.isProbablePrime()) {
      return easy;
    }
    // Try adding zero digit
    for (int pos = 1; pos < ones.length(); ++pos) {
      final String v = ones.substring(0, pos) + '0' + ones.substring(pos);
      final Z t = new Z(v);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // Try adding a digit 2 .. 9
    for (int pos = ones.length(); pos > 0; --pos) {
      for (char digit = '2'; digit <= '9'; ++digit) {
        final String v = ones.substring(0, pos) + digit + ones.substring(pos);
        final Z t = new Z(v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
