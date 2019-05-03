package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097550 Number of positive words of length n in the monoid <code>Br_3</code> of positive braids on 4 strands.
 * @author Sean A. Irvine
 */
public class A097550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097550() {
    super(new long[] {1, -2, 3}, new long[] {1, 3, 8});
  }
}
