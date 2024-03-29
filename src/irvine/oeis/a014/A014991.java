package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014991 a(n) = (1 - (-9)^n)/10.
 * @author Sean A. Irvine
 */
public class A014991 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-9);
    return Z.ONE.subtract(mT).divide(10);
  }
}
