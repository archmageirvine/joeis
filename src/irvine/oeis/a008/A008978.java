package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008978 <code>a(n) = (5*n)!/(n!)^5</code>.
 * @author Sean A. Irvine
 */
public class A008978 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(5 * mN).multiply(5 * mN - 1).multiply(5 * mN - 2).multiply(5 * mN - 3).multiply(5 * mN - 4)
        .divide(Z.valueOf(mN).pow(5));
    }
    return mF;
  }
}

