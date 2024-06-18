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

  Z b(final int n, final int q) {
    return Integers.SINGLETON.sum(0, q, k -> Binomial.binomial(n - q + 1, 2L * q - n - k).multiply(Binomial.binomial(n - q + k, n - q)));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return b(mN, mM);
  }
}
