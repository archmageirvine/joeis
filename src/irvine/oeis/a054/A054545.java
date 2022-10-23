package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054545 Number of labeled digraphs on n unisolated nodes (inverse binomial transform of A053763).
 * @author Sean A. Irvine
 */
public class A054545 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).shiftLeft(k * (k - 1)));
    }
    return sum;
  }
}
