package irvine.oeis.a290;
// manually 2025-09-03/polya at 2025-09-03 09:26

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a014.A014103;

/**
 * A290271 Expansion of j(q) * q * Product_{n&gt;=1} (1+q^n)^24 where j(q) is the elliptic modular invariant (A000521).
 * new A000521(), new A014103()
 * @author Georg Fischer
 */
public class A290271 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A290271() {
    super(0, "[1]", "x,B,x,C,*", 0, 0, 1, 1, new A000521(), new A014103());
    next();
  }
}
