package irvine.oeis.a135;
// manually rowsums at 2026-09-22 20: 20

import irvine.oeis.PrependSequence;
import irvine.oeis.a071.A071951;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A135921 O.g.f.: A(x) = Sum_{n&gt;=0} x^n / Product_{k=0..n} (1 - k*(k+1)*x).
 * @author Georg Fischer
 */
public class A135921 extends PrependSequence {

  /** Construct the sequence. */
  public A135921() {
    super(0, new RowSumSequence(0, new A071951()), 1);
  }
}
