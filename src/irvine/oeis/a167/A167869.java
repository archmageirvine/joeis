package irvine.oeis.a167;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A167869 a(n) = 4^n * Sum_{k=0..n} binomial(2*k,k)^3 / 4^k.
 * @author Sean A. Irvine
 */
public class A167869 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2L * k, k).pow(3).shiftLeft(2L * (mN - k - 1)));
    }
    return sum;
  }
}

