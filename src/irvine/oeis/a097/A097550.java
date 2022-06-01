package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097550 Number of positive words of length n in the monoid Br_3 of positive braids on 4 strands.
 * @author Sean A. Irvine
 */
public class A097550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097550() {
    super(new long[] {1, -2, 3}, new long[] {1, 3, 8});
  }
}
