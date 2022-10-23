package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A036448 Smallest positive number containing n e's when spelled out in US English.
 * @author Sean A. Irvine
 */
public class A036448 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    int m = 0;
    while (true) {
      final String english = English.SINGLETON.toRawText(++m);
      int c = 0;
      for (int k = 0; k < english.length(); ++k) {
        if (english.charAt(k) == 'e') {
          ++c;
        }
      }
      if (c == mN) {
        return Z.valueOf(m);
      }
    }
  }
}
