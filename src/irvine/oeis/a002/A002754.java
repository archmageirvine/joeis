package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002754 Related to coefficient of m in Jacobi elliptic function cn(z, m).
 * @author Sean A. Irvine
 */
public class A002754 extends Sequence0 {

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
