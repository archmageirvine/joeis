package irvine.oeis.a174;
// Generated by gen_seq4.pl 2025-07-17.ack/polya at 2025-07-18 00:03

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000041;

/**
 * A174065 Convolved with its aerated variant = A000041.
 * new A000041()
 * @author Georg Fischer
 */
public class A174065 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A174065() {
    super(0, "[1],[0,0,1]", "x,B,p1,sub,/", 0, 0, 1, 1, new A000041());
  }
}
