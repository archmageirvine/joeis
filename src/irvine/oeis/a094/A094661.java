package irvine.oeis.a094;
// manually 2026-10-12/lambdan at 2026-10-12 

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A094661 Numerator of the sum of the ratios of consecutive primes.
 * @author Georg Fischer
 */
public class A094661 extends LambdaSequence {

  /** Construct the sequence. */
  public A094661() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Functions.PRIME.z(k + 1)).divide(Functions.PRIME.z(k))).num());
  }
}
