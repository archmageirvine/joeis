package irvine.oeis.a082;

import irvine.oeis.PartialSumSequence;

/**
 * A082692 Partial sums of A082691.
 * @author Sean A. Irvine
 */
public class A082692 extends PartialSumSequence {

  /** Construct the sequence. */
  public A082692() {
    super(1, new A082691());
  }
}
