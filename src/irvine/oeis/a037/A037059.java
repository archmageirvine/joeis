package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037059 Smallest prime containing exactly n 3's.
 * @author Sean A. Irvine
 */
public class A037059 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String threes = StringUtils.rep('3', mN);
    final Z easy = new Z(threes);
    if (easy.isProbablePrime()) {
      return easy;
    }
    // Try adding 1, 2 digit (apparently 0 never occurs here)
    for (int pos = 0; pos < threes.length(); ++pos) {
      for (char digit = '1'; digit <= '2'; ++digit) {
        final String v = threes.substring(0, pos) + digit + threes.substring(pos);
        final Z t = new Z(v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    // Try adding a digit 4 .. 9
    for (int pos = threes.length(); pos > 0; --pos) {
      for (char digit = '4'; digit <= '9'; ++digit) {
        final String v = threes.substring(0, pos) + digit + threes.substring(pos);
        final Z t = new Z(v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
