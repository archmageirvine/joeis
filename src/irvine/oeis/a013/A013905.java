package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013905 22^(5n+4).
 * @author Sean A. Irvine
 */
public class A013905 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(234256) : mA.multiply(5153632);
    return mA;
  }
}
