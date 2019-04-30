package irvine.oeis.a091;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A091369 <code>a(n) = Sum_{i=1..n} phi(i)*ceiling(n/i)</code>.
 * @author Sean A. Irvine
 */
public class A091369 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Euler.phi(Z.valueOf(k)).multiply((mN + k - 1) / k));
    }
    return sum;
  }
}

