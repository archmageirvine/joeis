package irvine.oeis.a266;
// manually 2025-02-01/filpriq at 2025-02-02 21:26

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A266963 Numbers k such that (2^(k+7) * 5^(k+6) - 1024877)/9 is prime (k &gt; 0).
 * @author Georg Fischer
 */
public class A266963 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A266963() {
    super(1, 1, k -> {
      final Q q = new Q(Z.TWO.pow(k + 7).multiply(Z.FIVE.pow(k + 6)).subtract(1024877), 9);
      return q.isInteger() && q.num().isProbablePrime();
    });
  }
}
