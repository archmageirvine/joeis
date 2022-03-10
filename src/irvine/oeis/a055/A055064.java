package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055064 a(n) = A004125(2^n) = A004125(2^n-1).
 * @author Sean A. Irvine
 */
public class A055064 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final long t = 1L << ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < t; ++k) {
      sum = sum.add(t % k);
    }
    return sum;
  }
}
