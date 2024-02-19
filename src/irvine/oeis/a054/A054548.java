package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054548 Triangular array giving number of labeled graphs on n unisolated nodes and k=0...n*(n-1)/2 edges.
 * @author Sean A. Irvine
 */
public class A054548 extends Sequence0 {

  private int mN = -1;
  private int mM = 1;

  @Override
  public Z next() {
    if (++mM > mN * (mN - 1) / 2) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(k * (k - 1L) / 2, mM)));
    }
    return sum;
  }
}
