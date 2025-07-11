package irvine.oeis.a218;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001187;

/**
 * A218374 Number of simple labeled graphs on n nodes with an even number of components.
 * egf(new A001187())
 * @author Georg Fischer
 */
public class A218374 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A218374() {
    super(0, "[1]", "x,B,1,-,cosh", 0, 1, 1, 1, egf(new A001187()));
  }
}
