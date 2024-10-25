package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A072750 Counting factor 7 in the first n squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072750 extends A005117 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().mod(7) == 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
