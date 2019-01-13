package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163980.
 * @author Sean A. Irvine
 */
public class A163980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163980() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 5});
  }
}
