package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008776 Pisot sequences E(2,6), L(2,6), P(2,6), T(2,6).
 * @author Sean A. Irvine
 */
public class A008776 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(3);
    return mA;
  }
}
