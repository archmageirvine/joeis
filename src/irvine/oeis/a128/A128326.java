package irvine.oeis.a128;
// manually 2025-03-04/poly at 2025-03-05 14:53

import irvine.oeis.PolynomialFieldSequence;

/**
 * A128326 G.f.: A(x) = 1 + G(G(G(x))), where G(x) = x + x*G(G(x)) is the g.f. of A030266.
 * A(x) = x/(1 - A(x/(1 - A(x))))
 * @author Georg Fischer
 */
public class A128326 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A128326() {
    super(0, "[[0, 1]]", ",x, 1,x, 1,A,-,/,sub,-,/");
    next();
  }
}
