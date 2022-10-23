package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014986 a(n) = (1 - (-5)^n)/6.
 * @author Sean A. Irvine
 */
public class A014986 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-5);
    return Z.ONE.subtract(mT).divide(6);
  }
}
