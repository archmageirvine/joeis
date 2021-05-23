package irvine.oeis.a047;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047872 a(n) = floor(abs(B_(n+1)/B_(n))) where B_n is the n-th Bernoulli number.
 * @author Sean A. Irvine
 */
public class A047872 implements Sequence {

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

