package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013889 a(n) = 18^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013889 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(104976) : mA.multiply(1889568);
    return mA;
  }
}
