package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077044.
 * @author Sean A. Irvine
 */
public class A077044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077044() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 10, 51, 155, 381, 780, 1451});
  }
}
