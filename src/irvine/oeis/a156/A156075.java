package irvine.oeis.a156;
// manually 2025-07-12/polyx at 2025-07-12 11:17

import irvine.oeis.PolynomialFieldSequence;

/**
 * A156075 P_n(3) (see A155100).
 * @author Georg Fischer
 */
public class A156075 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A156075() {
    super(-1, "[1]", "1,x,cos,3,x,sin,*,-,log,-", 0, 1);
    next();
  }
}
