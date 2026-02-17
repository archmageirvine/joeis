package irvine.oeis.a381;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083799 Main diagonal of A083798.
 * @author Sean A. Irvine
 */
public class A381466 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z g = Functions.GCD.z(mA, mN);
      if (g.isOne()) {
        mA = mA.add(mN);
      } else {
        mA = Z.valueOf(mN).divide(g);
      }
    }
    return mA;
  }
}
