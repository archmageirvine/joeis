package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A000852 Numbers beginning with a vowel in English.
 * @author Sean A. Irvine
 */
public class A000852 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final char c = English.SINGLETON.toText(++mN).charAt(0);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        return Z.valueOf(mN);
      }
    }
  }
}

