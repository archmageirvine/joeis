package irvine.oeis.a107;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.oeis.a065.A065408;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A107289 Numbers k such that the sum of digits of k^2 is a prime.
 * @author Georg Fischer
 */
public class A107289 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A107289() {
    super(1, new A065408(), v -> v.sqrt());
  }
}
