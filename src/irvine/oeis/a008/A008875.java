package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008875 <code>3x+1</code> sequence starting at 95.
 * @author Sean A. Irvine
 */
public class A008875 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(95) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}


