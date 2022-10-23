package irvine.oeis.a051;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051228 Numbers m such that the Bernoulli number B_m has denominator 42.
 * @author Sean A. Irvine
 */
public class A051228 extends Sequence1 {

  private static final Z Z42 = Z.valueOf(42);
  private final BernoulliSequence mB = new BernoulliSequence(2);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q b = mB.nextQ();
      if (b.den().equals(Z42)) {
        return Z.valueOf(mN);
      }
    }
  }
}
