package irvine.oeis.a084;

import irvine.oeis.PartialSumSequence;

/**
 * A084505 Partial sums of A084506.
 * @author Sean A. Irvine
 */
public class A084505 extends PartialSumSequence {

  /** Construct the sequence. */
  public A084505() {
    super(0, new A084506().prepend(0));
  }
}
