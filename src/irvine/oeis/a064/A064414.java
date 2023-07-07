package irvine.oeis.a064;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000057 Primes dividing all Fibonacci sequences.
 * @author Sean A. Irvine
 */
public class A064414 extends Sequence1 {

  private long mN = 0;

  private boolean test(final long aStart, final long bStart) {
    Z a = Z.valueOf(aStart);
    Z b = Z.valueOf(bStart);
    long k = 0;
    while (++k <= 2 * mN) {
      final Z t = a.add(b);
      a = b;
      b = t;
      if (t.mod(mN) == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      boolean ok = true;
      for (long a = 1; a <= LongUtils.sqrt(mN); ++a) {
        for (long b = 1; b <= LongUtils.sqrt(mN); ++b) {
          if (!test(a, b)) {
            ok = false;
            break;
          }
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

