package irvine.oeis.a084;

import irvine.oeis.PartialSumSequence;

/**
 * A084515 Partial sums of A084516.
 * @author Sean A. Irvine
 */
public class A084515 extends PartialSumSequence {

  /** Construct the sequence. */
  public A084515() {
    super(0, new A084516().prepend(0));
  }
}
