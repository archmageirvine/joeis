package irvine.oeis.a069;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a050.A050278;

/**
 * A069012 Number of distinct representations of n as the ratio A/B, where A and B taken together are pandigital (i.e., contains all digits 0 through 9 once).
 * @author Sean A. Irvine
 */
public class A069012 extends Sequence2 {

  private final HashMap<Long, Integer> mCounts = new HashMap<>();
  private final Sequence mPandigital = new A050278();
  private long mN = 1;

  @Override
  public Z next() {
    if (mCounts.isEmpty()) {
      // Computes all nonzero terms of sequence
      while (true) {
        final Z pan = mPandigital.next();
        if (pan == null) {
          break;
        }
        final long p = pan.longValue();
        for (long mod = 10, t = 1; mod <= 100000; mod *= 10, t *= 10) {
          final long b = p % mod;
          if (b >= t) { // Avoids leading 0's
            final long a = p / mod;
            if (a % b == 0) {
              mCounts.merge(a / b, 1, Integer::sum);
            }
          }
        }
      }
    }
    final Integer res = mCounts.get(++mN);
    return res == null ? Z.ZERO : Z.valueOf(res);
  }
}

