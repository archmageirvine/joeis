package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051502 Number of asymmetric types of Boolean functions of n variables under action of complementing group C(n,2).
 * @author Sean A. Irvine
 */
public class A051502 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.gaussianBinomial(mN, k, 2).shiftLeft(k * (k - 1) / 2 + (1 << (mN - k))));
    }
    return sum.divide(Z.ONE.shiftLeft(mN));
  }
}

