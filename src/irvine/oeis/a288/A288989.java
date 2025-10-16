package irvine.oeis.a288;
// manually 2025-10-15/polyxa at 2025-10-15 09:56

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a029.A029828;
import irvine.oeis.a058.A058550;

/**
 * A288989 Denominators of coefficients in expansion of E_14/E_12.
 * @author Georg Fischer
 */
public class A288989 extends PrependSequence {

  /** Construct the sequence. */
  public A288989() {
    super(0, new PolynomialFieldSequence(0, "[1]", "x,B,x,C,/", 0, 4, 1, 1, new A058550(), new A029828()), 1);
  }
}
