package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083519 Beginning with 1, a(i)*a(j) + 2 is prime for all i, j, i != j.
 * @author Sean A. Irvine
 */
public class A083519 extends CachedSequence {

  /** Construct the sequence. */
  public A083519() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      Z t = self.a(n - 1);
      while (true) {
        t = t.add(2);
        boolean ok = true;
        for (int k = 1; k < n; ++k) {
          if (!t.multiply(self.a(k)).add(2).isProbablePrime()) {
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

