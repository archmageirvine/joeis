package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007516 (2^2^...^2) (n times) + 1.
 * @author Sean A. Irvine
 */
public class A007516 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    mA = Z.ONE.shiftLeft(mA.intValueExact());
    return mA.add(1);
  }
}
