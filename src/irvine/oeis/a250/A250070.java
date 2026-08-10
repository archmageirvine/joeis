package irvine.oeis.a250;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A250070 Smallest number k such that the symmetric representation of sigma(k) has at least one part of width n.
 * @author Sean A. Irvine
 */
public class A250070 extends Sequence1 {

  // After Hartmut F. W. Hoft

  private long mN = 1;
  private long mWidth = 0;
  private final Map<Long, Long> mFirst = new HashMap<>();
  {
    mFirst.put(1L, 1L);
  }

  private static long maxWidth(final long n) {
    long r = (long) ((Math.sqrt(8.0 * n + 1) - 1) / 2);
    while ((r + 1) * (r + 2) / 2 <= n) {
      ++r;
    }
    while (r * (r + 1) / 2 > n) {
      --r;
    }
    long sum = 0;
    long max = 0;
    for (long k = 1; k <= r; ++k) {
      final boolean present = (k & 1) != 0 ? n % k == 0 : (n - k / 2) % k == 0;
      if (present) {
        sum += (k & 1) != 0 ? 1 : -1;
        if (sum > max) {
          max = sum;
        }
      }
    }
    return max;
  }

  @Override
  public Z next() {
    ++mWidth;
    while (!mFirst.containsKey(mWidth)) {
      ++mN;
      final long width = maxWidth(mN);
      mFirst.putIfAbsent(width, mN);
    }
    return Z.valueOf(mFirst.get(mWidth));
  }
}
