package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024199 a(n) = (2n-1)!! * Sum_{k=0..n-1}(-1)^k/(2k+1).
 * @author Sean A. Irvine
 */
public class A024199 extends Sequence0 {

  private Z mA = Z.ZERO;
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      if (mN > 2) {
        mF = mF.multiply(2 * mN - 3);
      }
      mA = mA.multiply(2 * mN - 1).signedAdd((mN & 1) == 1, mF);
    }
    return mA;
  }
}

