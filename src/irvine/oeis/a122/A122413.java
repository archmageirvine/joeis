package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a031.A031134;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A122413 Indices of primes occurring in A031134.
 * @author Georg Fischer
 */
public class A122413 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A122413() {
    super(1, new A031134(), v -> Functions.PRIME_PI.z(v));
  }
}
