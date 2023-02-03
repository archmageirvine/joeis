package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053156 Number of 2-element intersecting families (with not necessarily distinct sets) whose union is an n-element set.
 * @author Sean A. Irvine
 */
public class A053156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053156() {
    super(new long[] {6, -11, 6}, new long[] {1, 3, 10});
  }
}
