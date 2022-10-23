package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037067 Smallest prime containing exactly n 7's.
 * @author Sean A. Irvine
 */
public class A037067 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String sevens = StringUtils.rep('7', mN);
    final Z easy = new Z(sevens);
    if (easy.isProbablePrime()) {
      return easy;
    }
    // Try adding 1, 2 digit (apparently 0 never occurs here)
    for (int pos = 0; pos < sevens.length(); ++pos) {
      for (char digit = '0'; digit <= '6'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = sevens.substring(0, pos) + digit + sevens.substring(pos);
          final Z t = new Z(v);
          if (t.isProbablePrime()) {
            return t;
          }
        }
      }
    }
    // Try adding a digit 4 .. 9
    for (int pos = sevens.length(); pos > 0; --pos) {
      for (char digit = '8'; digit <= '9'; ++digit) {
        final String v = sevens.substring(0, pos) + digit + sevens.substring(pos);
        final Z t = new Z(v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
