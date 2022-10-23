package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003422 Left factorials: !n = Sum_{k=0..n-1} k!.
 * @author Sean A. Irvine
 */
public class A003422 extends Sequence0 {

  protected long mN = -2;
  private Z mF = Z.ONE;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    if (mN >= 0) {
      mS = mS.add(mF);
    }
    return mS;
  }
}
