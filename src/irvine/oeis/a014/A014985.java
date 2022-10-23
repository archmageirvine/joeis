package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014985 a(n) = (1 - (-4)^n)/5.
 * @author Sean A. Irvine
 */
public class A014985 extends Sequence1 {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-4);
    return Z.ONE.subtract(mT).divide(5);
  }
}
