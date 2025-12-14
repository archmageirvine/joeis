package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A082552/
 * @author Sean A. Irvine
 */
public class A082553 extends CachedSequence {

  /** Construct the sequence. */
  public A082553() {
    super(1, Integer.class, (self, n) -> {
      if (Predicates.SQUARE_FREE.is(n)) {
        return Z.ONE;
      }
      final HashSet<Long> m = new HashSet<>();
      for (long k = 1; k < n; ++k) {
        m.add(k);
      }
      for (long p = Functions.NEXT_PRIME.l(Functions.SQRT.l(n)); p <= n; p = Functions.NEXT_PRIME.l(p)) {
        for (int k = 1; k <= n / p; ++k) {
          m.remove(p * k);
        }
        if (n % p == 0) {
          return self.a((int) (n / p));
        }
      }
      long c = 0;
      final Bumper bumper = BumperFactory.range(0, 1);
      final int[] v = new int[m.size()];
      do {
        int k = 0;
        Z prod = Z.valueOf(n);
        int cnt = 1;
        for (final long u : m) {
          if (v[k++] > 0) {
            prod = prod.multiply(u);
            ++cnt;
          }
        }
        c += prod.root(cnt).auxiliary();
      } while (bumper.bump(v));
      return Z.valueOf(c);
    });
  }
}
