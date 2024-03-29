package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014989 a(n) = (1 - (-7)^n)/8.
 * @author Sean A. Irvine
 */
public class A014989 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-7);
    return Z.ONE.subtract(mT).divide(8);
  }
}
