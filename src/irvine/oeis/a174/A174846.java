package irvine.oeis.a174;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A174846 E.g.f.: AGM(1, exp(4x)), where AGM(x, y) is the arithmetic-geometric mean of Gauss.
 * @author Georg Fischer
 */
public class A174846 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A174846() {
    super(0, "[[1],[0, 4]", ", 1,p1,exp,agm", 0, 1);
  }
}
