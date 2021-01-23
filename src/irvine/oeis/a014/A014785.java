package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014785 a(n) = Sum_{0&lt;=k&lt;=n} ceiling(k^2/n).
 * @author Sean A. Irvine
 */
public class A014785 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).square().add(mN - 1).divide(mN));
    }
    return sum;
  }
}
