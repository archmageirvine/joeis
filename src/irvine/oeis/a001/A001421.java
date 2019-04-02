package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001421 a(n) = (6n)!/((n!)^3*(3n)!).
 * @author Sean A. Irvine
 */
public class A001421 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(24).multiply(6 * mN - 5).multiply(2 * mN - 1).multiply(6 * mN - 1).divide(mN).divide(mN).divide(mN);
    }
    return mA;
  }
}
