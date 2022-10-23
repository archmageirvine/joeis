package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005610 Number of Boolean functions realized by cascades of n gates.
 * @author Sean A. Irvine
 */
public class A005610 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(6);
    return mA.subtract(1).multiply2().divide(5);
  }
}

