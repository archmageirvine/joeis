package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163196.
 * @author Sean A. Irvine
 */
public class A163196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163196() {
    super(new long[] {-1, 20, -35, -35, 20}, new long[] {-4, 4, 108, 2160, 39200});
  }
}
