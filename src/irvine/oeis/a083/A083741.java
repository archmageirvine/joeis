package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A083741 a(n) = L(n) + a(L(n)), where L(n) = n - 2^floor(log_2(n)) (A053645).
 * @author Sean A. Irvine
 */
public class A083741 extends CachedSequence {

  /** Construct the sequence. */
  public A083741() {
    super(0, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.ZERO;
      }
      if ((n & 1) == 0) {
        return self.a(n / 2).multiply2();
      }
      if ((n & 3) == 1) {
        return self.a(n / 4).multiply2().add(self.a(n / 2 + 1));
      }
      return self.a(n / 2).multiply(3).subtract(self.a(n / 4).multiply2()).add(1);
    });
  }
}
