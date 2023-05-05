package irvine.oeis.a359;
// manually partsum at 2023-05-04 08:23

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002326;

/**
 * A359147 Partial sums of A002326.
 * @author Georg Fischer
 */
public class A359147 extends PartialSumSequence {

  /** Construct the sequence. */
  public A359147() {
    super(0, new A002326());
  }
}
