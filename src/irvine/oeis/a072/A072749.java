package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A072749 Count of factors of 5 in the first n squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072749 extends A005117 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().mod(5) == 0) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
