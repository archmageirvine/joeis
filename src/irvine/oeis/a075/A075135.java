package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075135 Numerator of the generalized harmonic number H(n,3,1) described below.
 * @author Sean A. Irvine
 */
public class A075135 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.ONE;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(3);
    return mSum.num();
  }
}
