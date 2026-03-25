package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394218 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A394218 extends CachedSequence {

  private static final CachedSequence C = new CachedSequence(1, Long.class, (self, n) -> {
    if (n <= 5) {
      return n == 5 ? Z.ONE : Z.ZERO;
    }
    final long m = n / 3;
    return n % 3 == 0 ? self.a(m - 1) : self.a(m);
  });

  /** Construct the sequence. */
  public A394218() {
    super(1, Long.class, (self, n) -> {
      if (n <= 1) {
        return n == 1 ? Z.ONE : Z.ZERO;
      }
      if (n <= 4) {
        return Z.TWO;
      }
      if (n == 5) {
        return Z.THREE;
      }
      final long m = n / 3;
      switch ((int) (n % 3)) {
        case 0:
          return self.a(m - 2).add(self.a(m - 1)).add(self.a(m)).add(1).add(C.a(m - 1));
        case 1:
          return self.a(m - 1).add(self.a(m)).add(self.a(m + 1));
        case 2:
        default:
          return self.a(m).add(self.a(m + 1)).add(self.a(m + 2)).subtract(1).subtract(C.a(m));
      }
    });
  }

}
