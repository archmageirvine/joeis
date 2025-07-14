package irvine.oeis.a156;
// manually 2025-07-12/polyx at 2025-07-12 11:17

import irvine.oeis.PolynomialFieldSequence;

/**
 * A156073 P_n(2) (see A155100).
 * @author Georg Fischer
 */
public class A156073 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A156073() {
    super(-1, "[1]", "1,x,cos,2,x,sin,*,-,log,-", 0, 1);
    next();
  }
}
