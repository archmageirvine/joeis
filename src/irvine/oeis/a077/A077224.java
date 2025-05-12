package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A077193.
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

