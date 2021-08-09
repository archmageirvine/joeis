package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050158 T(n, k) = S(2*n + 1, n, k + 1) for 0&lt;=k&lt;=n and n &gt;= 0, array S as in A050157.
 * @author Sean A. Irvine
 */
public class A050158 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * mN + 1, mN + 1).subtract(Binomial.binomial(2 * mN + 1, mN - mM - 1));
  }
}
