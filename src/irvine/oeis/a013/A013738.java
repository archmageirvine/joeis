package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013738 a(n) = 6^(3*n + 1).
 * @author Sean A. Irvine
 */
public class A013738 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SIX : mA.multiply(216);
    return mA;
  }
}
