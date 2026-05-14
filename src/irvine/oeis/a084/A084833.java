package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A084833 a(n) is the smallest number such that a(n) + a(n-1), a(n) + a(n-1) + a(n-2), ..., a(n) + ... + a(1) are nonprime.
 * @author Sean A. Irvine
 */
public class A084833 extends CachedSequence {

  /** Construct the sequence. */
  public A084833() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      long m = 0;
      while (true) {
        Z sum = Z.valueOf(++m);
        boolean ok = true;
        for (long k = n - 1; k > 0; --k) {
          sum = sum.add(self.a(k));
          if (sum.isProbablePrime()) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return Z.valueOf(m);
        }
      }
    });
  }
}

