package irvine.oeis.a113;
// Generated by gen_seq4.pl 2025-06-08.ack/polya at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001190;

/**
 * A113299 Expansion of solution to an algebraic functional equation.
 * new A001190()
 * @author Georg Fischer
 */
public class A113299 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A113299() {
    super(1, "[1]", "x,1,x,B,-,^2,x,-,/", 0, 0, 1, 1, new A001190());
  }
}
