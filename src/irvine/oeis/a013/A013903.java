package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013903 a(n) = 22^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013903 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(484) : mA.multiply(5153632);
    return mA;
  }
}
