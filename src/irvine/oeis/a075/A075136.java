package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075136 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Q mN = Q.ONE;

  @Override
  public Z next() {
    mSum = mSum.add(mN.reciprocal());
    mN = mN.add(4);
    return mSum.num();
  }
}
