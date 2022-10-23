package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001178 Fibonacci frequency of n.
 * @author Sean A. Irvine
 */
public class A001178 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    int omega = 0;
    long pi = ++mN;
    while (true) {
      final long p = A001175.pisanoPeriod(pi);
      if (p == pi) {
        return Z.valueOf(omega);
      }
      pi = p;
      ++omega;
    }
  }
}
