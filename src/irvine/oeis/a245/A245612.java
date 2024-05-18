package irvine.oeis.a245;

import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a254.A254049;

/**
 * A245612 Permutation of natural numbers: a(0) = 1, a(1) = 2, a(2n) = 3*a(n)-1, a(2n+1) = A254049(a(n)); composition of A048673 and A163511.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245612 extends CachedSequence {

  private static final DirectSequence SEQ = new A254049();

  /** Construct the sequence. */
  public A245612() {
    super(0, Integer.class, (self, n) -> {
      if (n <= 1) {
        return n == 0 ? Z.ONE : Z.TWO;
      } else if ((n & 1) == 0) {
        return self.a(n / 2).multiply(3).subtract(1);
      } else {
        return SEQ.a(self.a(n / 2));
      }
    });
  }
}
