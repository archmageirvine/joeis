package irvine.oeis.a053;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A053153 Number of 3-element intersecting families whose union is an n-element set.
 * @author Sean A. Irvine
 */
public class A053153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053153() {
    super(new long[] {-840, 2038, -1849, 820, -190, 22}, new long[] {0, 0, 13, 170, 1605, 13390});
  }
}
