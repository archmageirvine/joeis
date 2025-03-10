package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A072747 Counting factor 2 in the first n squarefree numbers.
 * @author Sean A. Irvine
 */
public class A072747 extends A005117 {

  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    if (super.next().isEven()) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
