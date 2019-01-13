package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001699.
 * @author Sean A. Irvine
 */
public class A001699 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    mA = mS.multiply(mA).multiply2().add(mA.square());
    mS = mS.add(mB);
    mB = mA;
    return mA;
  }
}
