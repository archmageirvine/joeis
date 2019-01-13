package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002380.
 * @author Sean A. Irvine
 */
public class A002380 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mT = mT.multiply(3);
      mA = mA.multiply2().add(1);
    }
    return mT.and(mA);
  }
}
