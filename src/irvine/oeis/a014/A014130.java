package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014130 ((n+3)!/6)*product( 2*k+1, k=0..n).
 * @author Sean A. Irvine
 */
public class A014130 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -2;

  @Override
  public Z next() {
    if (++mN >= 0) {
      mA = mA.multiply(2 * mN + 3).multiply(mN + 4);
    }
    return mA;
  }
}
