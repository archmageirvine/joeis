package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A050481 The first, second, fourth, sixth, seventh, ... letters in this sentence are consonants (ignoring spaces and commas).
 * @author Sean A. Irvine
 */
public class A050481 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder(" the");
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final char c = mA.charAt(++mN);
      if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
        mA.append(English.SINGLETON.toOrdinalText(mN).replace(" and ", "").replaceAll("[- ,]", ""));
        return Z.valueOf(mN);
      }
    }
  }
}

