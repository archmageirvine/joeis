package irvine.oeis.a001;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001896 Numerators of cosecant numbers -2*(2^(2*n - 1) - 1)*Bernoulli(2*n); also of Bernoulli(2*n, 1/2) and Bernoulli(2*n, 1/4).
 * @author Sean A. Irvine
 */
public class A001896 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    } else {
      return mB.get(mN).multiply(Z.ONE.shiftLeft(mN - 1).subtract(1).multiply(-2)).num();
    }
  }
}
