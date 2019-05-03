package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;

/**
 * A002443 Numerator in Feinler's formula for unsigned Bernoulli number <code>|B_{2n}|</code>.
 * @author Sean A. Irvine
 */
public class A002443 extends A002444 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z res = mB.nextQ().multiply(super.next()).toZ().abs();
    mB.nextQ();
    return res;
  }
}
