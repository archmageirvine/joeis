package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001783 n-phi-torial, or phi-torial of n: Product k, 1 &lt;= k &lt;= n, k relatively prime to n.
 * @author Sean A. Irvine
 */
public class A001783 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    ++mN;
    for (long k = 2; k < mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        prod = prod.multiply(k);
      }
    }
    return prod;
  }
}

