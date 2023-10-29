package irvine.oeis.a212;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A212796 Square array read by antidiagonals: T(m,n) = number of spanning trees in C_m X C_n.
 * @author Sean A. Irvine
 */
public class A212796 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  protected Z numberOfSpanningTrees(final long n, final long m) {
    CR prod = CR.ONE;
    for (long k = 1; k < m; ++k) {
      for (long j = 1; j < n; ++j) {
        prod = prod.multiply(CR.PI.multiply(k).divide(m).sin().square().add(CR.PI.multiply(j).divide(n).sin().square()));
      }
    }
    return prod.multiply(Z.ONE.shiftLeft(2 * (m - 1) * (n - 1))).round().multiply(m).multiply(n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return numberOfSpanningTrees(mN - mM, mM + 1);
  }
}
