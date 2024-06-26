package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049020 Triangle of numbers a(n,k), 0 &lt;= k &lt;= n: number of set partitions of {1,2,...,n} in which exactly k of the blocks have been distinguished.
 * @author Sean A. Irvine
 */
public class A049020 extends Sequence0 {

  private int mN = -1;
  protected int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.STIRLING2.z(mN, k).multiply(Binomial.binomial(k, mM)));
    }
    return sum;
  }
}

