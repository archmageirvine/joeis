package irvine.oeis.a167;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A167871 a(n) = 64^n*Sum_{ k=0..n } binomial(2*k,k)^3/64^k.
 * @author Sean A. Irvine
 */
public class A167871 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * k, k).pow(3).shiftLeft(6 * (mN - k - 1)));
    }
    return sum;
  }
}

