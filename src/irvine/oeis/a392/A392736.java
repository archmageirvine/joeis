package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A392736 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A392736 extends CachedSequence {

  /** Construct the sequence. */
  public A392736() {
    super(0, Integer.class, (self, n) -> {
      if (n <= 1) {
        return Z.valueOf(n);
      }
      final int q = n >>> 2;
      switch (n & 3) {
        case 0:
          return self.a(q);
        case 1:
          return Z.ONE.subtract(self.a(q));
        case 2:
          return self.a(2 * q + 1 - self.a(q).intValue());
        default:
          return Z.ONE.subtract(self.a(2 * q + 1 - self.a(q).intValue()));
      }
    });
  }
}
