package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075139 Numerator of the generalized harmonic number H(n,5,2).
 * @author Sean A. Irvine
 */
public class A075139 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.TWO;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(5);
    return mSum.num();
  }
}
