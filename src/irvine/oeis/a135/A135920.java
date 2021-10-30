package irvine.oeis.a135;
// manually rowsums at 2021-10-29 15:35

import irvine.oeis.PrependSequence;
import irvine.oeis.a036.A036969;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A135920 O.g.f.: A(x) = Sum_{n&gt;=0} x^n / Product_{k=0..n} (1 - k^2*x).
 * @author Georg Fischer
 */
public class A135920 extends PrependSequence {

  /** Construct the sequence. */
  public A135920() {
    super(new RowSumSequence(new A036969()), 1);
  }
}
