package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013753 a(n) = 13^(3*n + 2).
 * @author Sean A. Irvine
 */
public class A013753 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(169) : mA.multiply(2197);
    return mA;
  }
}
