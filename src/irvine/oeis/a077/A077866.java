package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077866.
 * @author Sean A. Irvine
 */
public class A077866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077866() {
    super(new long[] {2, -4, 1, 2}, new long[] {1, 2, 5, 8});
  }
}
