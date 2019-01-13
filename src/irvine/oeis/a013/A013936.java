package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013936.
 * @author Sean A. Irvine
 */
public class A013936 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k * k <= mN; ++k) {
      sum = sum.add(mN / (k * k));
    }
    return sum;
  }
}
