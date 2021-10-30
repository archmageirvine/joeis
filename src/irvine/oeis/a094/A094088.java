package irvine.oeis.a094;
// manually rowsums at 2021-10-29 15:35

import irvine.oeis.PrependSequence;
import irvine.oeis.a241.A241171;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A094088 E.g.f. 1/(2-cosh(x)) (even coefficients).
 * @author Georg Fischer
 */
public class A094088 extends PrependSequence {

  /** Construct the sequence. */
  public A094088() {
    super(new RowSumSequence(new A241171()), 1);
  }
}
