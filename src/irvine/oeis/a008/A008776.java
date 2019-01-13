package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008776.
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
