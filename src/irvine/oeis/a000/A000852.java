package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A000852.
 * @author Sean A. Irvine
 */
public class A000852 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final char c = English.toEnglish(++mN).charAt(0);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        return Z.valueOf(mN);
      }
    }
  }
}

