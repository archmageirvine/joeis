package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010843.
 * @author Sean A. Irvine
 */
public class A010843 implements Sequence {

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
