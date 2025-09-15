package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387465 Irregular triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt; 2^(n-1), where T(n,k) = Product_{j=0..n-1} prime(n-j)^((j+1)*d_j), where d_j is the bit with digit weight 2^j in the binary expansion of 2^(n-1)+k.
 * @author Sean A. Irvine
 */
public class A387465 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM >= 1L << (mN - 1)) {
      ++mN;
      mM = 0;
    }
    final long s = (1L << (mN - 1)) + mM;
    Z prod = Z.ONE;
    for (long j = 0; j < mN; ++j) {
      if ((s & (1L << j)) != 0) {
        prod = prod.multiply(Functions.PRIME.z(mN - j).pow(j + 1));
      }
    }
    return prod;
  }
}

