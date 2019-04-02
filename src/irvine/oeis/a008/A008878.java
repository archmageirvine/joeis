package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008878 3x+1 sequence starting at 39.
 * @author Sean A. Irvine
 */
public class A008878 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(39) : mA.isEven() ? mA.divide2() : mA.multiply(3).add(1);
    return mA;
  }
}


