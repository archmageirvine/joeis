package irvine.oeis.a064;
// generated by patch_offset.pl at 2023-06-16 18:44

import irvine.oeis.a047.A047916;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A064649 Row sums of the table A047916.
 * @author Georg Fischer
 */
public class A064649 extends RowSumSequence {

  /** Construct the sequence. */
  public A064649() {
    super(1, new A047916());
  }
}
