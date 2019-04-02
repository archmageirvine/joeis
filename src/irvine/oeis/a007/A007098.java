package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a228.A228601;

/**
 * A007098 Number of unlabeled bisectable trees with 2n+1 nodes.
 * @author Sean A. Irvine
 */
public class A007098 extends A228601 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(k + 1, 2).multiply(a(mN, k)));
    }
    return sum;
  }
}
