package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002674 a(n) = (2n)!/2.
 * @author Sean A. Irvine
 */
public class A002674 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(2 * mN).multiply(2 * mN - 1);
    }
    return mA;
  }
}
