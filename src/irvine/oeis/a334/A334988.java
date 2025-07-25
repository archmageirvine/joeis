package irvine.oeis.a334;
// Generated by gen_seq4.pl 2025-07-13.ack/polyxa at 2025-07-13 21:23

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a068.A068980;

/**
 * A334988 Sum of tetrahedral numbers dividing n.
 * new A068980()
 * @author Georg Fischer
 */
public class A334988 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A334988() {
    super(1, "[0,1]", "x,B,log,n,*", 1, 0, 1, 1, new A068980());
  }
}
