package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013875 a(n) = 15^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013875 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(225) : mA.multiply(759375);
    return mA;
  }
}
