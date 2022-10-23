package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009975 Powers of 31: a(n) = 31^n.
 * @author Sean A. Irvine
 */
public class A009975 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(31);
    return mA;
  }
}
