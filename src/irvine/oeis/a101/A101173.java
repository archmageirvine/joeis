package irvine.oeis.a101;

import irvine.math.z.Z;
import irvine.oeis.a155.A155033;

/**
 * A101173 First differences of sequence defined in A101172. Also, the Mobius transform of that sequence.
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
