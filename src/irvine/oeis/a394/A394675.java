package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394675 Start with a(1) = 1, a(2) = 2, followed by a stream of 0's. At any step, the value of a(n-1) is added to the positions from a(n+1) to a(n+a(n)).
 * @author Sean A. Irvine
 */
public class A394675 extends CachedSequence {

  /** Construct the sequence. */
  public A394675() {
    super(1, Long.class, (self, n) -> {
      if (n == 1) {
        return Z.ONE;
      }
      if (n == 2) {
        return Z.TWO;
      }
      Z sum = Z.ZERO;
      for (long k = n - 1; k > 1; --k) {
        if (self.a(k).compareTo(n - k - 1) > 0) {
          sum = sum.add(self.a(k - 1));
        }
      }
      return sum;
    });
  }
}
