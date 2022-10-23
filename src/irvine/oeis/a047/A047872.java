package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047872 a(n) = floor(abs(B(2*n + 2)/B(2*n))) where B(n) is the n-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A047872 extends Sequence0 {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Q mA = mB.nextQ();

  @Override
  public Z next() {
    final Q t = mA;
    mB.nextQ();
    mA = mB.nextQ();
    return mA.divide(t).abs().floor();
  }
}

