package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395628 allocated for M. F. Hasler.
 * @author Sean A. Irvine
 */
public class A395628 extends Sequence0 {

  private Q mF = Q.ONE;
  private Z mFac = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.reciprocal().multiply(mN + 1);
    mFac = mFac.multiply(mN);
    return mF.multiply(mFac).toZ();
  }
}
