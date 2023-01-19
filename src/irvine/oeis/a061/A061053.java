package irvine.oeis.a061;

import irvine.math.q.BernoulliSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061053 a(n) = (n+1)!*Sum_{k=0..n} C(2k, k)*B(n-k), where B(n) is n-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A061053 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN + 1);
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(2L * k, k).multiply(mB.get(mN - k).multiply(mF).toZ()));
  }
}
