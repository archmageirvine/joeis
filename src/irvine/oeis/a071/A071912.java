package irvine.oeis.a071;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A071912 a(0) = 0, a(1) = 1; to get a(n+1) for n &gt;= 1, let m = a(n) and consider in turn the numbers k = m-1, m-2, ..., 2, 1, m+1, m+2, m+3, ... until reach a k such that gcd(m,k) = 1 and m/k is different from all a(i)/a(i+1) for i = 0, ..., n-1.
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
