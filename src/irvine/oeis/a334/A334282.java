package irvine.oeis.a334;
// manually rowsums at 2021-10-29 15:35

import irvine.oeis.PrependSequence;
import irvine.oeis.a046.A046860;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A334282 Number of properly colored labeled graphs on n nodes so that the color function is surjective onto {c_1,c_2,...,c_k} for some k, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A334282 extends PrependSequence {

  /** Construct the sequence. */
  public A334282() {
    super(new RowSumSequence(new A046860()), 1);
  }
}
