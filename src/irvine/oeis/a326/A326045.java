package irvine.oeis.a326;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A326045 a(n) is the sum of divisors of n, minus the largest square dividing that sum, minus n: a(n) = sigma(n) - A008833(sigma(n)) - n.
 * @author Georg Fischer
 */
public class A326045 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A326045() {
    super(1, new A326040(), (n, v) -> v.subtract(n));
  }
}
