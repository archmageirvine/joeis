package irvine.oeis.a116;
// Generated by gen_seq4.pl 2023-10-19/simtraf at 2023-10-19 23:32

import irvine.oeis.a002.A002822;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A116958 Numbers k such that 2*k + 5 and 2*k + 7 are twin primes.
 * @author Georg Fischer
 */
public class A116958 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A116958() {
    super(1, new A002822(), v -> v.subtract(1).multiply(3));
  }
}
