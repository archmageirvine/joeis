package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014983 a(n) = (1 - (-3)^n)/4.
 * @author Sean A. Irvine
 */
public class A014983 extends Sequence0 {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(-3);
    return Z.ONE.subtract(mT).divide(4);
  }
}
