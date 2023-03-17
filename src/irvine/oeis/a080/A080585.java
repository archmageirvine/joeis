package irvine.oeis.a080;

import irvine.oeis.PartialSumSequence;

/**
 * A080585 Partial sums of A080584.
 * @author Georg Fischer
 */
public class A080585 extends PartialSumSequence {

  /** Construct the sequence. */
  public A080585() {
    super(0, new A080584());
  }
}
