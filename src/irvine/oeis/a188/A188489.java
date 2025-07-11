package irvine.oeis.a188;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000275;

/**
 * A188489 Exponential transform of (A000275 number of pairs of permutations with rise/rise forbidden).
 * new A000275()
 * @author Georg Fischer
 */
public class A188489 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A188489() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A000275());
  }
}
