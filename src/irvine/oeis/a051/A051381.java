package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051381 Number of Boolean functions of n variables from Post class F(5,inf).
 * @author Sean A. Irvine
 */
public class A051381 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(mN, k).shiftLeft((1 << (mN - k)) - 1));
    }
    return sum;
  }
}

