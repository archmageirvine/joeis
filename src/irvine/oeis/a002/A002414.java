package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002414.
 * @author Sean A. Irvine
 */
public class A002414 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.multiply(mN.add(1)).multiply(mN.multiply(2).subtract(1)).divide(2);
  }
}
