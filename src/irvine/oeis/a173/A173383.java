package irvine.oeis.a173;
// manually partsum at 2021-09-13 21:35

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000014;
/**
 * A173383 Partial sums of A000014.
 * @author Georg Fischer
 */
public class A173383 extends PartialSumSequence {

  /** Construct the sequence. */
  public A173383() {
    super(new A000014());
  }
}
