package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A077224 a(0) = 1; for n &gt; 1, a(n) = smallest number &gt; a(n-1) such that a(n) + a(k) is squarefree for k = 1 to n-1.
 * @author Sean A. Irvine
 */
public class A077224 extends CachedSequence {

  /** Construct the sequence. */
  public A077224() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      while (true) {
        t = t.add(1);
        boolean ok = true;
        for (int k = 0; k < n; ++k) {
          if (!Predicates.SQUARE_FREE.is(t.add(self.a(k)))) {
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

