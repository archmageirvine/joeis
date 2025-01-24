package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074596 Numerator of 3 * H(n,3,1), a generalized harmonic number. See A075135.
 * @author Sean A. Irvine
 */
public class A074596 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.ONE_THIRD;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(1);
    return mSum.num();
  }
}
