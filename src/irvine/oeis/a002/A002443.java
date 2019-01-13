package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.q.BernoulliSequence;

/**
 * A002443.
 * @author Sean A. Irvine
 */
public class A002443 extends A002444 {

  private final BernoulliSequence mB = new BernoulliSequence(0);

  @Override
  public Z next() {
    final Z res = mB.next().multiply(super.next()).toZ().abs();
    mB.next();
    return res;
  }
}
