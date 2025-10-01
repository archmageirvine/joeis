package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080793 Starting with a(0) = 1, smallest number k &gt; a(n-1) such that, for all a(m) with m &lt; n, k + a(m) is not squarefree.
 * @author Sean A. Irvine
 */
public class A080793 extends CachedSequence {

  /** Construct the sequence. */
  public A080793() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      while (true) {
        t = t.add(1);
        boolean ok = true;
        for (int k = 0; k < n; ++k) {
          if (Predicates.SQUARE_FREE.is(t.add(self.a(k)))) {
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
