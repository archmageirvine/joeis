package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127193 A 9th-order Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A127193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127193() {
    super(1, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
