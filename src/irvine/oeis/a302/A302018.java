package irvine.oeis.a302;
// Generated by gen_seq4.pl 2025-05-27.ack/polya at 2025-05-27 23:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000122;

/**
 * A302018 Expansion of 1/(1 - x*(1 + theta_3(x))/2), where theta_3() is the Jacobi theta function.
 * new A000122()
 * @author Georg Fischer
 */
public class A302018 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A302018() {
    super(0, "[1]", "1,1,1,x,S,+,<1,2,/,-,/", 0, 0, 1, 1, new A000122());
  }
}
