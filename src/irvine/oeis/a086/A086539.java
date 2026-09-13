package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A086539 Beginning with 1, a(n) = smallest number &gt; a(n-1) and coprime to the k previous terms, where k = floor(n/2).
 * @author Sean A. Irvine
 */
public class A086539 extends CachedSequence {

  /** Construct the sequence. */
  public A086539() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      while (true) {
        t = t.add(1);
        boolean ok = true;
        for (long j = 1; j <= n / 2; ++j) {
          if (!Functions.GCD.z(t, self.a(n - j)).isOne()) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return t;
        }
      }
    });
  }
}
