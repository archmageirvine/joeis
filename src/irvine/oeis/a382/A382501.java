package irvine.oeis.a382;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;

/**
 * A382501 Lexicographically earliest infinite sequence of positive integers such that, for any given k, every subsequence {a(j), a(j+k), a(j+2k)} (j, k &gt;= 1) is unique.
 * @author Sean A. Irvine
 */
public class A382501 extends CachedSequence {

  /** Construct the sequence. */
  public A382501() {
    super(1, Long.class, new BiFunction<>() {
      private final Set<String> mSeen = new HashSet<>();

      private boolean isOk(final DirectSequence self, final long n, final long t) {
        for (long k = 1; 2 * k < n; ++k) {
          final String key = self.a(n - 2 * k) + "," + self.a(n - k) + "," + t + "," + k;
          if (mSeen.contains(key)) {
            return false;
          }
        }
        return true;
      }

      @Override
      public Z apply(final DirectSequence self, final Long n) {
        long t = 0;
        while (true) {
          if (isOk(self, n, ++t)) {
            for (long k = 1; 2 * k < n; ++k) {
              final String key = self.a(n - 2 * k) + "," + self.a(n - k) + "," + t + "," + k;
              mSeen.add(key);
            }
            return Z.valueOf(t);
          }
        }
      }
    });
  }
}
