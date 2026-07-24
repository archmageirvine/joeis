package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A395245 Sum over all permutations of [n] of the number of doubly shaded squares in a certain graphical representation of the permutations.
 * @author Sean A. Irvine
 */
public class A395245 extends CachedSequence {

  /** Construct the sequence. */
  public A395245() {
    super(0, Long.class, (self, n) -> {
      if (n < 3) {
        return Z.valueOf(n * (n - 1) / 2);
      }
      return self.a(n - 2).multiply(n - 1).multiply(n + 1).multiply(n - 3).multiply(3 * n - 4)
        .add(self.a(n - 1).multiply(9 * n * n - 29 * n + 16))
        .divide(n - 2).divide(3 * n - 7);
    });
  }
}
