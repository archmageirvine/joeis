package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047677 Row 2 of square array defined in A047675: 2*n!*(n+1)!.
 * @author Sean A. Irvine
 */
public class A047677 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN * mN);
    }
    return mF.multiply(mN + 1).multiply2();
  }
}
