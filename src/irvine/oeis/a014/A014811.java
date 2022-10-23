package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014811 a(n) = Sum_{k=1..n-1} ceiling(k^2/n).
 * @author Sean A. Irvine
 */
public class A014811 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(Z.valueOf(k).square().add(mN - 1).divide(mN));
    }
    return sum;
  }
}
