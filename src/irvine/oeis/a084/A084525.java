package irvine.oeis.a084;

import irvine.oeis.PartialSumSequence;

/**
 * A084525 Partial sums of A084526.
 * @author Sean A. Irvine
 */
public class A084525 extends PartialSumSequence {

  /** Construct the sequence. */
  public A084525() {
    super(0, new A084526().prepend(0));
  }
}
