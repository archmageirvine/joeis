package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067778 Numbers n such that gcd(n, numerator(B(2n))) is not squarefree where B(2n) are the Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A067778 extends Sequence1 {

  private final BernoulliSequence mB = new BernoulliSequence(1);
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mB.nextQ();
      if (!Jaguar.factor(mB.nextQ().num().gcd(++mN)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
