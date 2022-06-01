package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084184 Partial sums of a Jacobsthal related sequence.
 * @author Sean A. Irvine
 */
public class A084184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084184() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 2, 7});
  }
}
