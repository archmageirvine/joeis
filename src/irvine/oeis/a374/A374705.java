package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-05-08.ack/polya at 2025-05-08 13:52

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000009;

/**
 * A374705 Number of integer compositions of n whose leaders of maximal strictly increasing runs sum to 2.
 * new A000009()
 * @author Georg Fischer
 */
public class A374705 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A374705() {
    super(0, "[1],[1,1],[1,1,1,1]", "x,S,<1,p1,/,^2,x,S,<2,p2,/,+", 0, 0, 1, 1, new A000009());
  }
}
