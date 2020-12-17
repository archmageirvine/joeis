package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.French;

/**
 * A037193 Number of consonants in n (in French).
 * @author Sean A. Irvine
 */
public class A037193 implements Sequence {

  private static final String VOWELS = "aeiou\u00E9";
  private int mN = -1;

  @Override
  public Z next() {
    final String french = French.SINGLETON.toRawText(++mN);
    int len = french.length();
    int vowels = 0;
    for (int k = 0; k < len; ++k) {
      if (VOWELS.indexOf(french.charAt(k)) >= 0) {
        ++vowels;
      }
    }
    return Z.valueOf(len - vowels);
  }
}
