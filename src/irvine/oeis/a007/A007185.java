package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007185.
 * @author Sean A. Irvine
 */
public class A007185 implements Sequence {

  private Z mMod = Z.ONE;
  private Z mA = null;

  @Override
  public Z next() {
    mMod = mMod.multiply(10);
    mA = mA == null ? Z.FIVE : mA.modSquare(mMod);
    return mA;
  }
}
