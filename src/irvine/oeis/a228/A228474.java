package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A228474 Number of steps required to reach zero in the wrecker ball sequence starting with n: On the k-th step (k = 1, 2, 3, ...) move a distance of k in the direction of zero. If the result has occurred before, move a distance of k away from zero instead. Set a(n) = -1 if 0 is never reached.
 * @author Sean A. Irvine
 */
public class A228474 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    // In seen use even values for +ve numbers, odds for -ve numbers
    // Note this will run out of memory long before we exceed limits of a long
    final LongDynamicBooleanArray seen = new LongDynamicBooleanArray();
    seen.set(2 * m);
    long k = 0;
    while (m != 0) {
      ++k;
      if (m > 0) {
        final long t = m - k;
        if (seen.isSet(t >= 0 ? 2 * t : 1 - 2 * t)) {
          m += k;
        } else {
          m = t;
        }
      } else {
        assert m < 0;
        final long t = m + k;
        if (seen.isSet(t >= 0 ? 2 * t : 1 - 2 * t)) {
          m -= k;
        } else {
          m = t;
        }
      }
      seen.set(m >= 0 ? 2 * m : 1 - 2 * m);
    }
    return Z.valueOf(k);
  }
}
