package irvine.oeis.a067;

import irvine.math.q.Q;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067564.
 * @author Sean A. Irvine
 */
public class A067578 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private Z mProd = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Euler.phi(++mN);
    mSum = mSum.add(new Q(Z.ONE, phi));
    mProd = mProd.multiply(phi);
    return mSum.multiply(mProd).toZ();
  }
}
