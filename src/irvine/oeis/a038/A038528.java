package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038528 If n has decimal expansion abc...d, with k digits, let f(n) be obtained by deleting all k's from abc...d, closing up and deleting initial 0's; sequence gives n such that f(f(f(...(n)))) = 0 or empty.
 * @author Sean A. Irvine
 */
public class A038528 extends Sequence1 {

  private long mN = 0;

  private long f(final long n) {
    final String s = Long.toString(n);
    final String r = s.replace(String.valueOf(s.length()), "");
    return r.isEmpty() ? 0 : Long.parseLong(r);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN > 999999999) {
        return null;
      }
      long m = mN;
      long r;
      do {
        r = m;
        m = f(m);
        if (r == 0) {
          return Z.valueOf(mN);
        }
      } while (r != m);
    }
  }
}
