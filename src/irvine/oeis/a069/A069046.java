package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069046 Denominator(sum(i=1,n,1/i^4))/denominator(sum(i=1,n,1/i^2)).
 * @author Sean A. Irvine
 */
public class A069046 extends Sequence1 {

  private Q mA = Q.ZERO;
  private Q mB = Q.ZERO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    mA = mA.add(new Q(Z.ONE, mN.pow(4)));
    mB = mB.add(new Q(Z.ONE, mN.square()));
    return mA.den().divide(mB.den());
  }
}

