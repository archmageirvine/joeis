package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000787.
 * @author Sean A. Irvine
 */
public class A000787 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long last = mN % 10;
      if (last == 0 || last == 1 || last == 6 || last == 8 || last == 9) {
        final String n = String.valueOf(mN);
        boolean ok = true;
        for (int k = 0, j = n.length() - 1; k < (n.length() + 1) / 2; ++k, --j) {
          final char c = n.charAt(k);
          if ("23457".indexOf(c) != -1) {
            ok = false;
            break;
          } else if (c == '6') {
            if (n.charAt(j) != '9') {
              ok = false;
              break;
            }
          } else if (c == '9') {
            if (n.charAt(j) != '6') {
              ok = false;
              break;
            }
          } else if (c != n.charAt(j)) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
