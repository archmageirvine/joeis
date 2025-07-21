package irvine.oeis.a118;
// manually 2025-07-21/polyxa at 2025-07-21 15:01

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a032.A032188;

/**
 * A118789 Row sums of triangle A118788.
 * new A032188()
 * @author Georg Fischer
 */
public class A118789 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A118789() {
    super(1, "[1]", "x,B,/n!,exp", 0, 1, 1, 1, new A032188());
    setOffset(0);
  }
}
