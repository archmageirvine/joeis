package irvine.oeis.a245;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a369.A369928;

/**
 * A245796 T(n,k) is the number of labeled graphs of n vertices and k edges that have endpoints, where an endpoint is a vertex with degree 1.
 * @author Gregory Morse
 */
public class A245796 extends Sequence1 {
  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > 1 + (long) (mN - 1) * (mN - 2) / 2) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial((long) mN * (mN - 1) / 2, mM).subtract(A369928.count(mN, mM));
  }
}
