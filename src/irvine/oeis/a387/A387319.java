package irvine.oeis.a387;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387319 allocated for Kenneth J Scheller.
 * @author Sean A. Irvine
 */
public class A387319 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long n) {
    final Q f3 = new Q((2 * n) % 3, 3);
    for (long m = 6; m <= n; m += 3) {
      if (new Q((2 * n) % m, m).equals(f3)) {
        return true;
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
