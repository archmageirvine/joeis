package irvine.oeis.a138;
// Generated by gen_seq4.pl 2025-07-08.ack/polya at 2025-07-08 21:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a022.A022493;

/**
 * A138265 Number of upper triangular zero-one matrices with n ones and no zero rows or columns.
 * new A022493()
 * @author Georg Fischer
 */
public class A138265 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A138265() {
    super(0, "[1],[1, 1]", "x,p1,/,B", 0, 0, 1, 1, new A022493());
  }
}
