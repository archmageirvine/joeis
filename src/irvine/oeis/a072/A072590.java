package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072590 Table T(n,k) giving number of spanning trees in complete bipartite graph K(n,k), read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A072590 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    return Z.valueOf(n).pow(m - 1).multiply(Z.valueOf(m).pow(n - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}
