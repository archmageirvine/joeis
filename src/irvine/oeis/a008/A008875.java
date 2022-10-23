package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008875 3x+1 sequence starting at 95.
 * @author Sean A. Irvine
 */
public class A008875 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(95) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}


