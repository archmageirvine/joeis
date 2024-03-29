package irvine.oeis.a301;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000255;

/**
 * A301423 Numbers k such that !k/(k-1) is prime, where !k = A000166(k) is the subfactorial of k.
 * @author Georg Fischer
 */
public class A301423 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A301423() {
    super(1, 4, new A000255().skip(2), PRIME);
  }
}
