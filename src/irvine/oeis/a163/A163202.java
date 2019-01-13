package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163202.
 * @author Sean A. Irvine
 */
public class A163202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163202() {
    super(new long[] {1, 20, 35, -35, -20}, new long[] {0, -1, 7, -118, 2079});
  }
}
