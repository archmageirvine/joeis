package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163756.
 * @author Sean A. Irvine
 */
public class A163756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163756() {
    super(new long[] {1, -3, 3}, new long[] {0, 14, 42});
  }
}
