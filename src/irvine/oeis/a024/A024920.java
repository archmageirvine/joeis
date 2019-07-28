package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024920 <code>a(n) = Sum_{k=1..n} (n-k) * floor(n/k)</code>.
 * @author Sean A. Irvine
 */
public class A024920 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(mN - k).multiply(mN / k));
    }
    return sum;
  }
}
