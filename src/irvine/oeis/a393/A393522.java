package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A393522 allocated for Hermann Gruber.
 * @author Sean A. Irvine
 */
public class A393522 extends CachedSequence {

  private static final int[] SMALL = {0, 1, 2, 2, 3, 4, 6, 8, 10, 12, 14, 20, 26, 34, 42, 52, 62, 82, 106, 138, 172, 212, 262, 330, 426, 554, 692, 862, 1062, 1322};

  /** Construct the sequence. */
  public A393522() {
    super(1, Integer.class, (self, n) -> {
      if (n < SMALL.length) {
        return Z.valueOf(SMALL[n]);
      }
      if (n % 6 <= 1) {
        return self.a(n - 6).multiply(4).add(2);
      } else {
        return self.a(n - 7).multiply(5).add(2);
      }
    });
  }
}
