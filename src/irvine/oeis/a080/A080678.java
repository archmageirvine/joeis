package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080662.
 * @author Sean A. Irvine
 */
public class A080678 extends CachedSequence {

  /** Construct the sequence. */
  public A080678() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      if (n <= 3) {
        return Z.ONE;
      }
      switch (n & 3) {
        case 0:
          return self.a(n / 4).multiply(4);
        case 1:
          return self.a(n / 4).multiply(3).add(self.a(n / 4 + 1));
        case 2:
          return self.a(n / 4).multiply2().add(self.a(n / 4 + 1).multiply2());
        default: // 3
          return self.a(n / 4).add(self.a(n / 4 + 1).multiply(3));
      }
    });
  }
}
