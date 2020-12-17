package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.German;

/**
 * A037199 Number of consonants in n (in German).
 * @author Sean A. Irvine
 */
public class A037199 implements Sequence {

  private static final String VOWELS = "aeiou\u00FC\u00F6";
  private int mN = -1;

  @Override
  public Z next() {
    final String german = German.SINGLETON.toRawText(++mN);
    int len = german.length();
    int vowels = 0;
    for (int k = 0; k < len; ++k) {
      if (VOWELS.indexOf(german.charAt(k)) >= 0) {
        ++vowels;
      }
    }
    return Z.valueOf(len - vowels);
  }
}
