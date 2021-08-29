package irvine.oeis.a051;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051222 Numbers n such that Bernoulli number B_{n} has denominator 6.
 * @author Sean A. Irvine
 */
public class A051222 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(2);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q b = mB.nextQ();
      if (b.den().equals(Z.SIX)) {
        return Z.valueOf(mN);
      }
    }
  }
}
