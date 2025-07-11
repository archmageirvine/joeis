package irvine.oeis.a137;
// Generated by gen_seq4.pl 2025-06-08.ack/polya at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a002.A002293;

/**
 * A137571 Main diagonal of square array A137570.
 * new A000108(), new A002293()
 * @author Georg Fischer
 */
public class A137571 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A137571() {
    super(0, "[1]", "1,1,x,B,<1,x,C,^2,*,-,x,C,^3,<1,-,/", 0, 0, 1, 1, new A000108(), new A002293());
  }
}
