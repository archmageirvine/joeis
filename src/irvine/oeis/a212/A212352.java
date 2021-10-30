package irvine.oeis.a212;
// manually rowsums/rowsums at 2021-10-29 15:35

import irvine.oeis.PrependSequence;
import irvine.oeis.a047.A047997;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A212352 Row sums of A047997.
 * @author Georg Fischer
 */
public class A212352 extends PrependSequence {

  /** Construct the sequence. */
  public A212352() {
    super(new RowSumSequence(new A047997()), 0);
  }
}
