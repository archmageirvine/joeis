package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013937.
 * @author Sean A. Irvine
 */
public class A013937 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k * k * k <= mN; ++k) {
      sum = sum.add(mN / (k * k * k));
    }
    return sum;
  }
}
