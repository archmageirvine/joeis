package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014994 a(n) = (1 - (-12)^n)/13.
 * @author Sean A. Irvine
 */
public class A014994 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-12);
    return Z.ONE.subtract(mT).divide(13);
  }
}
