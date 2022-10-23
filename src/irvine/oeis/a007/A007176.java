package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007176 Stopping times (see Borwein-Loring article for precise definition).
 * @author Sean A. Irvine
 */
public class A007176 extends Sequence1 {

  private long mN = 0;
  private long mPrev = -1;

  private long algo(final long c, final long n, final long m) {
    return m == 0 ? n : algo(c, n + 1, c * (m % n));
  }

  protected long c() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      long res = 0;
      for (long m = 1; m <= mN; ++m) {
        res = Math.max(res, algo(c(), mN, m));
      }
      if (res > mPrev) {
        mPrev = res;
        return Z.valueOf(res);
      }
    }
  }
}
