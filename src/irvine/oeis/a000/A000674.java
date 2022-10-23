package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000674 Boustrophedon transform of 1, 2, 2, 2, 2, ...
 * @author Sean A. Irvine
 */
public class A000674 extends Sequence0 {

  private int mN = -1;
  private Z[] mPrev = null;

  protected Z a(final int n) {
    return n == 0 ? Z.ONE : Z.TWO;
  }

  private Z b(final int n) {
    if (n == 0) {
      final Z a0 = a(0);
      mPrev = new Z[] {a0};
      return a0;
    }
    final Z[] t = new Z[n + 1];
    t[0] = a(n);
    for (int k = 1; k <= n; ++k) {
      t[k] = t[k - 1].add(mPrev[n - k]);
    }
    mPrev = t;
    return t[n];
  }

  @Override
  public Z next() {
    return b(++mN);
  }
}
