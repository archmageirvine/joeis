package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081344 Natural numbers in square maze arrangement, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A081344 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long i, final long j) {
    final long m = Math.max(i, j);
    return Z.valueOf(m * m - m + 1 - (i - j) * ((m & 1) == 0 ? 1 : - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}

