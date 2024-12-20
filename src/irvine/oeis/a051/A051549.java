package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000203;

/**
 * A051549 a(n) = LCM { sigma(1), ..., sigma(n) }.
 * @author Sean A. Irvine
 */
public class A051549 extends Sequence0 {

  private final Sequence mSigma = new A000203();
  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(mSigma.next());
    return mLcm;
  }
}
