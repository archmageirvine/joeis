package irvine.oeis.a218;
// Generated by gen_seq4.pl 2025-06-08.ack/polyxa at 2025-06-08 23:06

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a001.A001187;

/**
 * A218375 Number of simple labeled graphs on n nodes with an odd number of components.
 * egf(new A001187())
 * @author Georg Fischer
 */
public class A218375 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A218375() {
    super(0, "[1]", "x,B,1,-,sinh", 0, 1, 1, 1, egf(new A001187()));
  }
}
