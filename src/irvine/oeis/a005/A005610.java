package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005610.
 * @author Sean A. Irvine
 */
public class A005610 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(6);
    return mA.subtract(1).multiply2().divide(5);
  }
}

