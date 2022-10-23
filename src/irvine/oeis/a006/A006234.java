package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006234 a(n) = n*3^(n-4).
 * @author Sean A. Irvine
 */
public class A006234 extends Sequence3 {

  private long mN = 2;
  private Z mThrees = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    if (mN > 4) {
      mThrees = mThrees.multiply(3);
    }
    return mThrees.multiply(mN);
  }
}
