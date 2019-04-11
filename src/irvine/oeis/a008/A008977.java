package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008977 <code>a(n) = (4*n)!/(n!)^4</code>.
 * @author Sean A. Irvine
 */
public class A008977 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(4 * mN).multiply(4 * mN - 1).multiply(4 * mN - 2).multiply(4 * mN - 3)
        .divide(Z.valueOf(mN).pow(4));
    }
    return mF;
  }
}

