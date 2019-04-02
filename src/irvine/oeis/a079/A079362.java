package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079362 Sequence of sums of alternating powers of 3.
 * @author Sean A. Irvine
 */
public class A079362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079362() {
    super(new long[] {-3, 3, 1}, new long[] {1, 4, 5});
  }
}
