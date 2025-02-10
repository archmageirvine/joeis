package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075141 Numerator of the generalized harmonic number H(n,5,3).
 * @author Sean A. Irvine
 */
public class A075141 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.THREE;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(5);
    return mSum.num();
  }
}
