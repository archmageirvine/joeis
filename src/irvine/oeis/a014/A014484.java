package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014484 Expansion of (1+2x)/(1-2x)^4 (E.g.f.).
 * @author Sean A. Irvine
 */
public class A014484 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN + 1).multiply(mN + 2).multiply(2L * mN + 3).divide(6).shiftLeft(mN);
  }
}
