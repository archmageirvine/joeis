package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008896 <code>3x - 1</code> sequence starting at 66.
 * @author Sean A. Irvine
 */
public class A008896 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(66) : mA.isEven() ? mA.divide2() : mA.multiply(3).subtract(1);
    return mA;
  }
}


