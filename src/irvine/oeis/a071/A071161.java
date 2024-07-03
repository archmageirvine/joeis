package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071153.
 * @author Sean A. Irvine
 */
public class A071161 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN);
      final StringBuilder res = new StringBuilder();
      for (int k = 0; k < s.length(); ++k) {
        if (s.charAt(k) == '0') {
          res.append('0');
        } else {
          int j = 0;
          int c = 0;
          while (true) {
            ++c;
            ++j;
            if (s.charAt((k + j) % s.length()) != '0') {
              res.append(c);
              break;
            }
          }
        }
      }
      final Z t = new Z(res);
      if (t.equals(Z.valueOf(mN))) {
        return t;
      }
    }
  }
}
