package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007516 <code>(2^2^</code>...^2) <code>(n</code> times) <code>+ 1</code>.
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
