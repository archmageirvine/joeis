package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163250.
 * @author Sean A. Irvine
 */
public class A163250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163250() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {0, 0, 1, 5, 15});
  }
}
