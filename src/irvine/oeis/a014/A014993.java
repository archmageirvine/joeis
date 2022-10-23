package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014993 a(n) = (1 - (-11)^n)/12.
 * @author Sean A. Irvine
 */
public class A014993 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-11);
    return Z.ONE.subtract(mT).divide(12);
  }
}
