package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390514 Triangle read by rows: T(n,k) is the number of points missed by the longest non-intersecting loop starting at (0,0) on the n X k torus consisting of steps up and to the right, 1 &lt;= k &lt;= n.
 * @author Sean A. Irvine
 */
public class A390514 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long min = Long.MAX_VALUE;
    for (long k = 0; k < mM; ++k) {
      if (Functions.GCD.l(mM - k, (mN * k) / mM) == 1) {
        min = Math.min(min, (mN * k) % mM);
      }
    }
    return min == Long.MAX_VALUE ? Z.ZERO : Z.valueOf(min);
  }
}

