package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;

/**
 * A002427.
 * @author Sean A. Irvine
 */
public class A002427 implements Sequence {

  private final BernoulliSequence mB = new BernoulliSequence(0);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    final Q t = mB.next();
    mB.next();
    mN = mN.add(2);
    return t.multiply(mN).num();
  }
}
