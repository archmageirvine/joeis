package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014402 Numbers found in denominators of expansion of Airy function Ai(x).
 * @author Sean A. Irvine
 */
public class A014402 extends Sequence0 {

  protected int mN = -1;
  private int mM = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final long h = mN + mN / 2;
    while (h > mM) {
      mF = mF.multiply(++mM);
    }
    Z r = mF;
    for (int k = 0; k < mN / 2; ++k) {
      r = r.divide(3 * k + 1 + (mN & 1));
    }
    return r;
  }
}

