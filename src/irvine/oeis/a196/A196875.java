package irvine.oeis.a196;

import irvine.oeis.LinearRecurrence;

/**
 * A196875.
 * @author Sean A. Irvine
 */
public class A196875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196875() {
    super(new long[] {1, -1, 0, 0, -2, 3}, new long[] {1, 1, 1, 1, 4, 8});
  }
}
