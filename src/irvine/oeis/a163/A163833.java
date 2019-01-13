package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163833.
 * @author Sean A. Irvine
 */
public class A163833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163833() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 13, 59, 156});
  }
}
