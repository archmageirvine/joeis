package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008877 3x+1 sequence starting at 57.
 * @author Sean A. Irvine
 */
public class A008877 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(57) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}


