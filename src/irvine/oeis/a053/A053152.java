package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053152 Number of 2-element intersecting families whose union is an n-element set.
 * @author Sean A. Irvine
 */
public class A053152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053152() {
    super(new long[] {6, -11, 6}, new long[] {0, 2, 9});
  }
}
