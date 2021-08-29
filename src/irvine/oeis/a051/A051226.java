package irvine.oeis.a051;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051226 Numbers m such that the Bernoulli number B_m has denominator 30.
 * @author Sean A. Irvine
 */
public class A051226 implements Sequence {

  private static final Z Z30 = Z.valueOf(30);
  private final BernoulliSequence mB = new BernoulliSequence(2);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Q b = mB.nextQ();
      if (b.den().equals(Z30)) {
        return Z.valueOf(mN);
      }
    }
  }
}
