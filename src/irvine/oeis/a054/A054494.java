package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054494 Largest Fibonacci factor of n.
 * @author Sean A. Irvine
 */
public class A054494 implements Sequence {

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
    return Z.valueOf(best);
  }
}
