package irvine.oeis.a082;

import irvine.oeis.PartialSumSequence;

/**
 * A082847 Partial sums of A082846.
 * @author Sean A. Irvine
 */
public class A082847 extends PartialSumSequence {

  /** Construct the sequence. */
  public A082847() {
    super(1, new A082846());
  }
}
