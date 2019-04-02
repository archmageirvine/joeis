package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008883 3x+1 sequence starting at 51.
 * @author Sean A. Irvine
 */
public class A008883 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(51) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}


