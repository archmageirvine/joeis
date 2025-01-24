package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074597 Numerator of 3 * H(n,3,2), a generalized harmonic number. See A075135.
 * @author Sean A. Irvine
 */
public class A074597 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = new Q(2, 3);

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(1);
    return mSum.num();
  }
}
