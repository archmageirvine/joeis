package irvine.oeis.a249;

import irvine.math.z.Z;
import irvine.oeis.a237.A237048;

/**
 * A249223 Triangle read by rows: row n gives partial alternating sums of row n of A237048.
 * @author Sean A. Irvine
 */
public class A249223 extends A237048 {

  private long mN = 1;
  private long mM = -1;
  private long mR = 1;
  private long mS = 1;

  @Override
  protected long t(final long n, final long m) {
    long sum = 0;
    for (long k = 1; k <= m; ++k) {
      final long v = super.t(n, k);
      if ((k & 1) == 1) {
        sum += v;
      } else {
        sum -=v;
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mR) {
      if (--mS < 0) {
        mS = ++mR;
      }
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN, mM + 1));
  }
}
