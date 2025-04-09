package irvine.oeis.a076;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076549 Numerator of (2n+1)(2n+2) B_{2n}, where B_n are the Bernoulli numbers. Also numerators of the asymptotic expansion of the polygamma function psi'''(z).
 * @author Sean A. Irvine
 */
public class A076549 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private long mN = -4;

  @Override
  public Z next() {
    mN += 2;
    if (mN == -2) {
      return Z.TWO;
    }
    if (mN == 0) {
      return Z.THREE;
    }
    return mB.get(mN).multiply(mN + 1).multiply(mN + 2).num();
  }
}
