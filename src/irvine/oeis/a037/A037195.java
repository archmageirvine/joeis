package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A037195 Number of consonants in n.
 * @author Sean A. Irvine
 */
public class A037195 implements Sequence {

  private static final String VOWELS = "aeiouy";
  private int mN = -1;

  @Override
  public Z next() {
    final String english = English.SINGLETON.toRawText(++mN);
    final int len = english.length();
    int vowels = 0;
    for (int k = 0; k < len; ++k) {
      if (VOWELS.indexOf(english.charAt(k)) >= 0) {
        ++vowels;
      }
    }
    return Z.valueOf(len - vowels);
  }
}
