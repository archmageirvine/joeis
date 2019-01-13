package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056834.
 * @author Sean A. Irvine
 */
public class A056834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056834() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 1, 2, 3, 5, 7, 9});
  }
}
