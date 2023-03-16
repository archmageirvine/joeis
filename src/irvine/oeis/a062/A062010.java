package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062010 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      outer:
      for (long b = 2; b < 10; ++b) {
        long m = mN;
        long sum = 0;
        long t = 1;
        while (m != 0) {
          final long r = m % 10;
          if (r >= b) {
            continue outer;
          }
          sum += r * t;
          t *= b;
          m /= 10;
        }
        if (mN % sum == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
