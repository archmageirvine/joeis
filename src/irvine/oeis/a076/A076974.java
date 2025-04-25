package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A076974 Increasing sequence where each number is unequal to 2 mod all previous numbers.
 * @author Sean A. Irvine
 */
public class A076974 extends CachedSequence {

  /** Construct the sequence. */
  public A076974() {
    super(1, Integer.class, (self, n) -> {
      if (n == 1) {
        return Z.TWO;
      }
      long t = (self.a(n - 1).longValue() + 1) | 1;
      while (true) {
        boolean ok = true;
        for (int k = 1; k < n; ++k) {
          if (t % self.a(k).longValue() == 2) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(t);
        }
        t += 2;
      }
    });
  }
}

