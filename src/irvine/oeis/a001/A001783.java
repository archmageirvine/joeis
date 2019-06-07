package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001783 <code>n-phi-torial</code>, or phi-torial of n: Product k, <code>1 &lt;= k &lt;=</code> n, k relatively prime to <code>n</code>.
 * @author Sean A. Irvine
 */
public class A001783 implements Sequence {

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

