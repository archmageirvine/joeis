package irvine.oeis.a075;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A075774 Number of syllables in n in American English.
 * @author Sean A. Irvine
 */
public class A075774 extends Sequence0 implements DirectSequence {

  // After M. F. Hasler

  private static final long[] T = {1000000000000L, 2, 1000000000L, 2, 1000000L, 2, 1000, 2, 100, 2};
  private static final Set<Long> C = new HashSet<>(Arrays.asList(0L, 7L, 13L, 14L, 15L, 16L, 18L, 19L));
  private int mN = -1;

  private long a(final long n) {
    if (n > 99) {
      for (int k = 0; k < T.length; k += 2) {
        if (n >= T[k]) {
          final long q = n / T[k];
          final long r = n % T[k];
          return a(q) + T[k + 1] + (r == 0 ? 0 : a(r));
        }
      }
    }
    if (n < 20) {
      return 1 + (C.contains(n) ? 1 : 0) + (n == 11 || n == 17 ? 2 : 0);
    }
    return 2 + (n / 10 == 7 ? 1 : 0) + (n % 10 == 0 ? 0 : a(n % 10));
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(a((long) n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
