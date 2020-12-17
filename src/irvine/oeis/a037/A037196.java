package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A037196 Number of vowels in the American English name of n.
 * @author Sean A. Irvine
 */
public class A037196 implements Sequence {

  private static final String VOWELS = "aeiou";
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
    return Z.valueOf(vowels);
  }
}
