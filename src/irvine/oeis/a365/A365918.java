package irvine.oeis.a365;
// manually rowsums at 2026-09-22 20: 20

import irvine.oeis.PrependSequence;
import irvine.oeis.a046.A046663;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A365918 Number of distinct non-subset-sums of integer partitions of n.
 * @author Georg Fischer
 */
public class A365918 extends PrependSequence {

  /** Construct the sequence. */
  public A365918() {
    super(1, new RowSumSequence(1, new A046663()), 0);
  }
}
