package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163815.
 * @author Sean A. Irvine
 */
public class A163815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163815() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 42, 108});
  }
}
