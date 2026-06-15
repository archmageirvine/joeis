package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;

/**
 * A085302 Partial sums of A085301.
 * @author Sean A. Irvine
 */
public class A085302 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085302() {
    super(1, new A085301());
  }
}
