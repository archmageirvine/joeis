package irvine.oeis.a135;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.a107.A107689;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A135048 Indices of primes with digit product = 3.
 * @author Georg Fischer
 */
public class A135048 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A135048() {
    super(1, new A107689(), v -> Functions.PRIME_PI.z(v));
  }
}
