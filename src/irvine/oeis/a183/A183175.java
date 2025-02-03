package irvine.oeis.a183;
// manually 2025-02-01/filpriq at 2025-02-02 21:26

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A183175 Numbers k such that (10^(2k+1) + 6*10^k - 1)/3 is prime.
 * @author Georg Fischer
 */
public class A183175 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A183175() {
    super(1, 1, k -> {
      final Q q = new Q(Z.TEN.pow(2L * k + 1).add(Z.SIX.multiply(Z.TEN.pow(k)).subtract(1)), 3);
      return q.isInteger() && q.num().isProbablePrime();
    });
  }
}
