package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057836 Integers with 2 or more pairs of consecutive anti-divisors.
 * @author Sean A. Irvine
 */
public class A057836 implements Sequence {

  private long mN = 21;

  private boolean is(final long n) {
    final long n2 = 2 * n;
    final long n2p = n2 + 1;
    final long n2m = n2 - 1;
    boolean seenPair = false;
    boolean was = false;
    for (long k = 2; k < n; ++k) {
      if (n % k != 0) {
        if (((k & 1) == 0 && n2 % k == 0) || (k & 1) == 1 && (n2p % k == 0 || n2m % k == 0)) {
          if (was) {
            if (seenPair) {
              return true;
            }
            seenPair = true;
          } else {
            was = true;
          }
        } else {
          was = false;
        }
      } else {
        was = false;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
