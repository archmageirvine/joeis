package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024931.
 * @author Sean A. Irvine
 */
public class A024931 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; k += 2) {
      sum = sum.add(mN % k);
    }
    return sum;
  }
}
