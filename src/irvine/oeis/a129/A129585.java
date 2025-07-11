package irvine.oeis.a129;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;

/**
 * A129585 Number of labeled connected bi-point-determining graphs with n vertices (see A129583).
 * egf(new A129583())
 * @author Georg Fischer
 */
public class A129585 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A129585() {
    super(0, "[1],[1,1]", "p1,x,B,p1,/,log,+", 0, 1, 1, 1, egf(new A129583()));
  }
}
