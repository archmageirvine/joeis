package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061065 For n &lt;= 6, entry of maximal modulus in the inverse of the n-th Hilbert matrix. For n &gt;= 3, this is the (n-1,n-1)-th entry.
 * @author Sean A. Irvine
 */
public class A061065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 1 ? Z.ONE : Z.valueOf(12);
    }
    return Binomial.binomial(2 * mN - 4, mN - 2).square().multiply(2 * mN - 2).multiply(2 * mN - 2).multiply(2 * mN - 3);
  }
}
