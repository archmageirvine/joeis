package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000861 Numbers ending with a vowel in American English.
 * @author Sean A. Irvine
 */
public class A000861 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      final char c = s.charAt(s.length() - 1);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        return Z.valueOf(mN);
      }
    }
  }
}

