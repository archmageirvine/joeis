package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090453 Third column (m=4) of array A090452.
 * @author Sean A. Irvine
 */
public class A090453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090453() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {2, 16, 51, 118, 230});
  }
}
