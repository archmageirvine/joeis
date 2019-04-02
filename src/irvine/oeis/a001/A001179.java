package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001179 Leonardo logarithm of n.
 * @author Sean A. Irvine
 */
public class A001179 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long pi = A001175.pisanoPeriod(mN);
    while (true) {
      final long p = A001175.pisanoPeriod(pi);
      if (p == pi) {
        assert p % 24 == 0;
        long q = p / 24;
        long lambda = 1;
        while (q % 5 == 0) {
          ++lambda;
          q /= 5;
        }
        return Z.valueOf(lambda);
      }
      pi = p;
    }
  }
}
