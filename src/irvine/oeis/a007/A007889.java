package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007889 Number of intransitive (or alternating, or Stanley) trees: vertices are [0,n] and for no i&lt;j&lt;k are both (i,j) and (j,k) edges.
 * @author Sean A. Irvine
 */
public class A007889 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(k).pow(mN - 1)));
    }
    return sum.divide(mN).shiftRight(mN - 1);
  }
}
