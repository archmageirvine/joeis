package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A393253 allocated for Jeffrey Shallit.
 * @author Sean A. Irvine
 */
public class A393253 extends CachedSequence {

  private static final long[] SMALL = {0, 1, 1, 2};

  /** Construct the sequence. */
  public A393253() {
    super(0, Integer.class, (self, n) -> {
      if (n < SMALL.length) {
        return Z.valueOf(SMALL[n]);
      }
      final int m = n >>> 2;
      switch (n & 3) {
        case 0:
          return self.a(m).multiply2();
        case 1:
        case 2:
          return self.a(m).multiply2().subtract(self.a(2 * m)).add(self.a(2 * m + 1));
        case 3:
        default:
          return self.a(m).subtract(self.a(2 * m)).add(self.a(2 * m + 1)).multiply2();
      }
    });
  }
}
