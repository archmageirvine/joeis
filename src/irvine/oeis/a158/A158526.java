package irvine.oeis.a158;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a048.A048395;

/**
 * A158526 n and (1 + 2*n + 2*n^2) are primes.
 * @author Georg Fischer
 */
public class A158526 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A158526() {
    super(1, 0, new A048395(), SEMIPRIME);
  }
}
