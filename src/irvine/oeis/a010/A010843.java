package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010843 Incomplete Gamma Function at -3.
 * @author Sean A. Irvine
 */
public class A010843 extends Sequence1 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(-3);
      mA = mA.multiply(mN).add(mT);
    }
    return mA;
  }
}
