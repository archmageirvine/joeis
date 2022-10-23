package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037071 Smallest prime containing exactly n 9's.
 * @author Sean A. Irvine
 */
public class A037071 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String nines = StringUtils.rep('9', mN);
    final Z easy = new Z(nines);
    if (easy.isProbablePrime()) {
      return easy;
    }
    // Try adding 1 .. 9 digit (apparently 0 never occurs here)
    for (int pos = 0; pos < nines.length(); ++pos) {
      for (char digit = '1'; digit <= '9'; ++digit) {
        final String v = nines.substring(0, pos) + digit + nines.substring(pos);
        final Z t = new Z(v);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
