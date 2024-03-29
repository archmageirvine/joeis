package irvine.oeis.a228;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a034.A034387;

/**
 * A228102 Numbers n such that sum of all primes &lt;=n is prime.
 * @author Georg Fischer
 */
public class A228102 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A228102() {
    super(1, 1, new A034387(), PRIME);
  }
}
