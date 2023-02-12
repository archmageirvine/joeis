package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061370 a(n) = floor(ratio of product and sum of first n numbers).
 * @author Sean A. Irvine
 */
public class A061370 extends Sequence1 {

  private Z mF = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.divide(++mN + 1);
  }
}

