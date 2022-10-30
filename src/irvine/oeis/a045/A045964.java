package irvine.oeis.a045;

import irvine.oeis.PartialSumSequence;

/**
 * A045964 Partial sums of A045954.
 * @author Sean A. Irvine
 */
public class A045964 extends PartialSumSequence {

  /** Construct the sequence. */
  public A045964() {
    super(1, new A045954());
  }
}
