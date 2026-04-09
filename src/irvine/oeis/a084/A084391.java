package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003586;

/**
 * A084391 For n&gt;3, a(n) = smallest number divisible by exactly n-2 previous terms; a(n)=n for n&lt;=3.
 * @author Sean A. Irvine
 */
public class A084391 extends CachedSequence {

  /** Construct the sequence. */
  public A084391() {
    super(1, Long.class, (self, n) -> {
      if (n <= 3) {
        return Z.valueOf(n);
      }
      final Sequence smooth = new A003586();
      while (true) {
        final Z s = smooth.next();
        long cnt = 0;
        for (long j = 1; j < n; ++j) {
          final Z t = self.a(j);
          if (!s.equals(t) && s.mod(t).isZero() && ++cnt > n - 2) {
            break;
          }
        }
        if (cnt == n - 2) {
          return s;
        }
      }
    });
  }
}
