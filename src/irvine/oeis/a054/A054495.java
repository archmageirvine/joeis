package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054495 Smallest k such that n/k is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A054495 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long a = 1;
    long b = 1;
    long best = 1;
    while (b < mN) {
      final long t = a + b;
      a = b;
      b = t;
      if (mN % b == 0) {
        best = b;
      }
    }
    return Z.valueOf(mN / best);
  }
}
