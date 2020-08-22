package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001814 Coefficient of H_2 when expressing x^{2n} in terms of Hermite polynomials H_m.
 * @author Sean A. Irvine
 */
public class A001814 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1).divide(mN - 1);
    }
    return mA;
  }
}
