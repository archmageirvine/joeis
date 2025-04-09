package irvine.oeis.a076;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076547 a(n) = (2^n-1-numerator(B(2^(n+1))))/2^n where numerator(B(k)) denotes the numerator of the k-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A076547 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN).subtract(1).subtract(mB.get(1L << (mN + 1)).num()).shiftRight(mN);
  }
}
