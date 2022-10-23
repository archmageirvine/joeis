package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006041 a(n+1) = (n^2 - 1)*a(n) + n + 1.
 * @author Sean A. Irvine
 */
public class A006041 extends Sequence1 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN * mN - 1).add(mN + 1);
    }
    return mA;
  }
}

