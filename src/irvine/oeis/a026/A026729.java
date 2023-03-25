package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A026729 Square array of binomial coefficients T(n,k) = binomial(n,k), n &gt;= 0, k &gt;= 0, read by downward antidiagonals.
 * @author Sean A. Irvine
 */
public class A026729 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mM, mN - mM);
  }
}
