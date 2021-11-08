package irvine.oeis.a173;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a074.A074206;

/**
 * A173382 Partial sums of A074206.
 * @author Georg Fischer
 */
public class A173382 extends PartialSumSequence {

  /** Construct the sequence. */
  public A173382() {
    super(new A074206());
  }
}
