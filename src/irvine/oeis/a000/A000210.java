package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000210 A Beatty sequence: floor(n*(e-1)).
 * @author Sean A. Irvine
 */
public class A000210 extends Sequence1 {

  private Q mE = Q.ONE.add(Q.HALF);
  private Z mF = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 2);
    mE = mE.add(new Q(Z.ONE, mF));
    return mE.multiply(mN).toZ();
  }
}

