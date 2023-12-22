package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067564.
 * @author Sean A. Irvine
 */
public class A067577 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Jaguar.factor(++mN).sigma();
    mSum = mSum.add(new Q(Z.ONE, s));
    mProd = mProd.multiply(s);
    return mSum.multiply(mProd).toZ();
  }
}
