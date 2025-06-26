package irvine.oeis.a188;
// manually 2025-06-24/polya at 2025-06-24 12:48

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a005.A005425;

/**
 * A188144 Binomial transform A140456(n+1) (indecomposable involutions).
 * new A005425()
 * @author Georg Fischer
 */
public class A188144 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A188144() {
    super(0, "[1]", "1,1,x,B,/,-", 0, 0, 1, 1, new A005425());
    skip(2);
  }
}
