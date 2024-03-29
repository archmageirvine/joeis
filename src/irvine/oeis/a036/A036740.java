package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036740 a(n) = (n!)^n.
 * @author Sean A. Irvine
 */
public class A036740 extends Sequence0 {

  private Z mF = Z.ONE;
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.pow(mN);
  }
}

