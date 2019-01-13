package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014202.
 * @author Sean A. Irvine
 */
public class A014202 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; k += 3) {
      sum = sum.add(mN / k - mN / (k + 1));
    }
    return sum;
  }
}
