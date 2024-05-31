package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007840 Number of factorizations of permutations of n letters into ordered cycles.
 * @author Sean A. Irvine
 */
public class A007840 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      f = f.multiply(k);
      sum = sum.add(f.multiply(Functions.STIRLING1.z(mN, k).abs()));
    }
    return sum;
  }
}
