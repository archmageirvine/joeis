package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015109 Triangle of Gaussian (or q-binomial) coefficients for q=-2.
 * @author Sean A. Irvine
 */
public class A015109 implements Sequence {

  private int mN = -1;
  private int mM = -1;
  private Z mQ = Z.valueOf(q());
  private Z mNum = null;
  private Z mDen = null;
  private Z mP = null;

  protected long q() {
    return -2;
  }

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ONE;
    } else if (mM > mN + 1) {
      ++mN;
      mM = 0;
      mQ = mQ.multiply(q());
      mNum = mQ;
      mDen = Z.ONE;
      mP = Z.ONE;
    } else {
      mNum = mNum.divide(q());
      mDen = mDen.multiply(q());
      mP = mP.multiply(mNum.subtract(1)).divide(mDen.subtract(1));
    }
    return mP;
  }
}
