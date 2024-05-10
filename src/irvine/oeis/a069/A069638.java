package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069638 "Sorted" sum of two previous terms, beginning with 0,1. "Sorted" means to sort the digits of the sum in ascending order.
 * @author Sean A. Irvine
 */
public class A069638 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = Functions.DIGIT_SORT_ASCENDING.z(mA.add(mB));
    mA = mB;
    mB = t;
    return t;
  }
}
