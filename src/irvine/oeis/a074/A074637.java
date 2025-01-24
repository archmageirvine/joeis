package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074637 Numerator of 4 * H(n,4,3), a generalized harmonic number.
 * @author Sean A. Irvine
 */
public class A074637 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = new Q(3, 4);

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(1);
    return mSum.num();
  }
}
