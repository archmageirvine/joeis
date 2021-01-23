package irvine.oeis.a167;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A167867 a(n) = 2^n*Sum_{ k=0..n } binomial(2*k,k)^3/2^k.
 * @author Sean A. Irvine
 */
public class A167867 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * k, k).pow(3).shiftLeft(mN - k - 1));
    }
    return sum;
  }
}

