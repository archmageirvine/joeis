package irvine.oeis.a301;
// manually 2026-09-05/rowsum at 2026-09-05 21: 31

import irvine.oeis.PrependSequence;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A301481 Number of unlabeled uniform hypergraphs spanning n vertices.
 * @author Georg Fischer
 */
public class A301481 extends PrependSequence {

  /** Construct the sequence. */
  public A301481() {
    super(0, new RowSumSequence(1, new A301922()), 1);
  }
}
