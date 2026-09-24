package irvine.oeis.a275;
// manually rowsums at 2026-09-22 20: 20

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000037;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A275740 Sums of the next n consecutive nonsquare integers.
 * @author Georg Fischer
 */
public class A275740 extends PrependSequence {

  /** Construct the sequence. */
  public A275740() {
    super(0, new RowSumSequence(0, new A000037()), 0);
  }
}
