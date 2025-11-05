package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387904 allocated for James S. DeArmon.
 * @author Sean A. Irvine
 */
public class A387904 extends Sequence1 {

  private long mN = 31;

  private boolean is(final long n) {
    final long r = n % 10;
    if (r == 0 || r == 4 || r == 6 || r == 8) {
      return false;
    }
    final String s = String.valueOf(n);
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) != '0') {
        for (int j = k + 1; j < s.length(); ++j) {
          final Z p = new Z(s.substring(k, j));
          if (p.isProbablePrime()) {
            for (int i = j; i < s.length(); ++i) {
              if (s.charAt(i) != '0') {
                for (int h = i + 1; h <= s.length(); ++h) {
                  final Z q = new Z(s.substring(i, h));
                  if (!p.equals(q) && q.isProbablePrime()) {
                    final Z t = new Z(s.substring(0, k) + q + s.substring(j, i) + p + s.substring(h));
                    if (t.isProbablePrime()) {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
