package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002754.
 * @author Sean A. Irvine
 */
public class A002754 implements Sequence {

  private Z mNines = Z.ONE;
  private Z mEights = Z.ZERO;

  @Override
  public Z next() {
    final Z res = mNines.subtract(mEights).subtract(1).shiftRight(4);
    mNines = mNines.multiply(9);
    mEights = mEights.add(8);
    return res;
  }
}
