package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038720 a(n) = (n+3)*n!/2.
 * @author Sean A. Irvine
 */
public class A038720 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    } else if (mN > 2) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN + 3);
  }
}
