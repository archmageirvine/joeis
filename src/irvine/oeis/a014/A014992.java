package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014992 a(n) = (1 - (-10)^n)/11.
 * @author Sean A. Irvine
 */
public class A014992 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-10);
    return Z.ONE.subtract(mT).divide(11);
  }
}
