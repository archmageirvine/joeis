package irvine.oeis.a298;

import irvine.oeis.PartialSumSequence;

/**
 * A298018 Partial sums of A298015.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A298018 extends PartialSumSequence {

  /** Construct the sequence. */
  public A298018() {
    super(0, new A298015());
  }
}
