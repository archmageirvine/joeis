package irvine.oeis.a006;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006675.
 * @author Sean A. Irvine
 */
public class A006675 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;
  private Q mH = Q.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mH = mH.add(new Q(1, mN));
    }
    return mH.subtract(1).multiply(mN).multiply(mF).toZ();
  }
}
