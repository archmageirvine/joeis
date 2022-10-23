package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A126259 Numbers that are divisible by the number of letters in their English name, excluding spaces and hyphens;.
 * @author Sean A. Irvine
 */
public class A126259 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      int c = 0;
      for (int k = 0; k < s.length(); ++k) {
        if (Character.isLetter(s.charAt(k))) {
          ++c;
        }
      }
      if (mN % c == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

