package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007689.
 * @author Sean A. Irvine
 */
public class A007689 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    mB = mB == null ? Z.ONE : mB.multiply(3);
    return mA.add(mB);
  }
}
