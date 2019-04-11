package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001451 <code>a(n) = (5*n)!/((3*n)!*n!*n!)</code>.
 * @author Sean A. Irvine
 */
public class A001451 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final long t = 5 * mN;
      mA = mA.multiply(5).multiply(t - 4).multiply(t - 3).multiply(t - 2).multiply(t - 1)
        .divide(3).divide(mN).divide(mN).divide(3 * mN - 2).divide(3 * mN - 1);
    }
    return mA;
  }
}
