package irvine.oeis.a317;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A317187 Arrange primes along the square spiral; sequence lists primes on the X-axis.
 * @author Georg Fischer
 */
public class A317187 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A317187() {
    super(1, new A317186(), v -> Functions.PRIME.z(v));
  }
}
