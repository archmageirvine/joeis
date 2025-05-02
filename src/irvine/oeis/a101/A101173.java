package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.a155.A155033;

/**
 * A381103.
 * @author Sean A. Irvine
 */
public class A101173 extends A155033 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
