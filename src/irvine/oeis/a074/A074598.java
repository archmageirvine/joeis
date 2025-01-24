package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074598 Numerator of 4 * H(n,4,1), a generalized harmonic number. See A075136.
 * @author Sean A. Irvine
 */
public class A074598 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.ONE_QUARTER;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(1);
    return mSum.num();
  }
}
