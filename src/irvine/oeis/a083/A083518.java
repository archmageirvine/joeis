package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083518 Beginning with 3, a(i)*a(j) + 2 is prime for all i, j, i != j.
 * @author Sean A. Irvine
 */
public class A083518 extends CachedSequence {

  /** Construct the sequence. */
  public A083518() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.THREE;
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

