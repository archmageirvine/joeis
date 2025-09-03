package irvine.oeis.a290;
// manually 2025-09-03/polya at 2025-09-03 09:26

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a121.A121591;

/**
 * A290272 Expansion of j(q) * q * Product_{n&gt;=1} ((1 - q^(5*n))/(1 - q^n))^6 where j(q) is the elliptic modular invariant (A000521).
 * new A000521(), new A121591()
 * @author Georg Fischer
 */
public class A290272 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A290272() {
    super(0, "[1]", "x,B,x,C,*", 0, 0, 1, 1, new A000521(), new A121591());
    next();
  }
}
