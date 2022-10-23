package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A001286 Lah numbers: a(n) = (n-1)*n!/2.
 * @author Sean A. Irvine
 */
public class A001286 extends Sequence2 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN > 2) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN - 1);
  }
}
