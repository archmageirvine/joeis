package irvine.oeis.a124;
// manually rowsums at 2026-09-22 20: 20

import irvine.oeis.PrependSequence;
import irvine.oeis.a080.A080248;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A124373 O.g.f.: A(x) = Sum_{n&gt;=0} x^n / Product_{k=0..n} (1 - k*(k+1)/2*x).
 * @author Georg Fischer
 */
public class A124373 extends PrependSequence {

  /** Construct the sequence. */
  public A124373() {
    super(0, new RowSumSequence(0, new A080248()), 1);
  }
}
