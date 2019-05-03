package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001814 Coefficient of <code>H_2</code> when expressing <code>x^{2n}</code> in terms of Hermite polynomials <code>H_m</code>.
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
