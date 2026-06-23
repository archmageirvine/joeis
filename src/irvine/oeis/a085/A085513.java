package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A085513 Number of "e"s in n (in English).
 * @author Sean A. Irvine
 */
public class A085513 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final String s = English.SINGLETON.toRawText(++mN);
    int cnt = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == 'e') {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
