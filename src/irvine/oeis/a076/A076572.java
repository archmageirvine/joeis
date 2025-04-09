package irvine.oeis.a076;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076572 a(0)=1 if n&gt;0 a(n)=(-1)^(n+1)/(2n+1) * Sum_{k=0..n} 4^(4k)*B(2k)*C(2n+1,2k) where B(k) denotes the k-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A076572 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Rationals.SINGLETON.sum(0, mN, k -> mB.get(2L * k).multiply(Binomial.binomial(2L * mN + 1, 2L * k).shiftLeft(8L * k))).abs().toZ().divide(2L * mN + 1);
  }
}
