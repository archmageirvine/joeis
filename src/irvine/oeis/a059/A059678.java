package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A059678 Triangle T(n,k) giving number of fixed 2 X k polyominoes with n cells (n &gt;= 2, 1&lt;=k&lt;=n-1).
 * @author Sean A. Irvine
 */
public class A059678 extends Sequence2 {

  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sum(0, mM, k -> Binomial.binomial(mN - mM + 1, 2L * mM - mN - k).multiply(Binomial.binomial(mN - mM + k, mN - mM)));
  }
}
