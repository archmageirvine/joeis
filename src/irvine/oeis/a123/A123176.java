package irvine.oeis.a123;
// Generated by gen_seq4.pl known4/simtraf at 2023-10-15 18:28

import irvine.math.function.Functions;
import irvine.oeis.a000.A000978;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A123176 Numbers n such that (2^p + 1)/3 is prime, where p is the n-th prime.
 * @author Georg Fischer
 */
public class A123176 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A123176() {
    super(1, new A000978(), v -> Functions.PRIME_PI.z(v));
  }
}
