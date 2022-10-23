package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002412 Hexagonal pyramidal numbers, or greengrocer's numbers.
 * @author Sean A. Irvine
 */
public class A002412 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.multiply(4).subtract(1)).divide(6);
  }
}
