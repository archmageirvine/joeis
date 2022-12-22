package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060734 Natural numbers written as a square array ending in last row from left to right and rightmost column from bottom to top are read by antidiagonals downwards.
 * @author Sean A. Irvine
 */
public class A060734 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long k) {
    return n <= k ? Z.valueOf(k).square().subtract(n - 1) : Z.valueOf(n - 1).square().add(k);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN + 1 - mM);
  }
}
