package irvine.oeis.a071;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A071912.
 * @author Sean A. Irvine
 */
public class A071912 extends CachedSequence {

  /** Construct the sequence. */
  public A071912() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      } else if (n <= 2) {
        return Z.ONE;
      } else {
        final Z m = self.a(n - 1);
        final Set<Q> ratios = new HashSet<>();
        for (int k = 0; k < n - 1; ++k) {
          ratios.add(new Q(self.a(k), self.a(k + 1)));
        }
        for (Z k = m.subtract(1); k.compareTo(1) >= 0; k = k.subtract(1)) {
          if (Functions.GCD.z(m, k).equals(Z.ONE) && !ratios.contains(new Q(m, k))) {
            return k;
          }
        }
        for (Z k = m.add(1); true; k = k.add(1)) {
          if (Functions.GCD.z(m, k).equals(Z.ONE) && !ratios.contains(new Q(m, k))) {
            return k;
          }
        }
      }
    });
  }
}
