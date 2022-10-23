package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013936 a(n) = Sum_{k=1..n} floor(n/k^2).
 * @author Sean A. Irvine
 */
public class A013936 extends Sequence1 {

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
