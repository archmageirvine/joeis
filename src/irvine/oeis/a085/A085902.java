package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A085902 a(0) = 2, a(n) is the smallest squarefree number &gt; a(n-1) such that the sum a(n) + a(i) for all i = 1 to (n-1) is squarefree. Or, sum of any two terms is a squarefree number.
 * @author Sean A. Irvine
 */
public class A085902 extends CachedSequence {

  /** Construct the sequence. */
  public A085902() {
    super(0, Long.class, (self, n) -> {
      if (n == 0) {
        return Z.TWO;
      }
      Z t = self.a(n - 1);
      while (true) {
        t = t.add(1);
        if (Predicates.SQUARE_FREE.is(t)) {
          boolean ok = true;
          for (long k = 0; k < n; ++k) {
            if (!Predicates.SQUARE_FREE.is(t.add(self.a(k)))) {
              ok = false;
              break;
            }
          }
          if (ok) {
            return t;
          }
        }
      }
    });
  }
}
