package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A084249 Triangle T(n,k) read by rows: permutations on 123...n with one abc pattern and no aj pattern with j&lt;=k, n&gt;2, k&lt;n-1.
 * @author Sean A. Irvine
 */
public class A084249 extends Sequence3 {

  private long mN = 3;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM + 1 == mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(2 * mN - mM - 1, mN)
      .subtract(Binomial.binomial(2 * mN - mM - 1, mN + 3))
      .add(Binomial.binomial(2 * mN - 2 * mM - 2, mN - mM - 4))
      .subtract(Binomial.binomial(2 * mN - 2 * mM - 2, mN - mM - 1))
      .add(Binomial.binomial(2 * mN - 2 * mM - 3, mN - mM - 4))
      .subtract(Binomial.binomial(2 * mN - 2 * mM - 3, mN - mM - 2));
  }
}
