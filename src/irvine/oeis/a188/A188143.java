package irvine.oeis.a188;
// manually 2025-06-24/polya at 2025-06-24 12:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a010.A010842;

/**
 * A188143 Binomial transform of A187848.
 * new A010842()
 * @author Georg Fischer
 */
public class A188143 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A188143() {
    super(0, "[1]", "1,1,x,B,/,-", 0, 0, 1, 1, new A010842());
    skip(2);
  }
}
