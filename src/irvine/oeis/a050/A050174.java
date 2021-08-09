package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050174 T(n,k) = S(n,k,k-2), 1&lt;=k&lt;=n-2, n &gt;= 3, array S as in A050157.
 * @author Sean A. Irvine
 */
public class A050174 implements Sequence {

  private int mN = 2;
  private int mM = 2;

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      ++mN;
      mM = 1;
    }
    return mM == 1 ? Z.valueOf(mN - 2) : Binomial.binomial(mN, mM).subtract(mN);
  }
}
