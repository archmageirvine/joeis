package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060543 Triangle, read by antidiagonals, where T(n,k) = C(n+n*k+k, n*k+k).
 * @author Sean A. Irvine
 */
public class A060543 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    return Binomial.binomial((long) n * m + n + m, (long) n * m + m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
