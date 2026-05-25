package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;

/**
 * A085007 Partial sums of A085006.
 * @author Sean A. Irvine
 */
public class A085007 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085007() {
    super(1, new A085006());
  }
}
