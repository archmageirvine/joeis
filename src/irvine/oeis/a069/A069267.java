package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002445;

/**
 * A069267 a(n) = (2^(n-1)/(2n)!)*Product_{k=1..n} q(k) where q(n) is the denominator of B(2n), the 2n-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A069267 extends Sequence1 {

  private final Sequence mBernoulliDenominators = new A002445().skip();
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mProd = mProd.multiply(mBernoulliDenominators.next());
    if (++mN > 1) {
      mProd = mProd.multiply2();
    }
    mProd = mProd.divide(2 * mN - 1).divide(2 * mN);
    return mProd;
  }
}
