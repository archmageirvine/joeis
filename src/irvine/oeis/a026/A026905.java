package irvine.oeis.a026;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;

/**
 * A026905 Partial sums of the partition numbers A000041 of the positive integers.
 * @author Sean A. Irvine
 */
public class A026905 extends PartialSumSequence {

  /** Construct the sequence. */
  public A026905() {
    super(1, new SkipSequence(new A000041(), 1));
  }
}
