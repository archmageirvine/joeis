package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127194 A 10th order Fibonacci sequence.
 * @author Sean A. Irvine
 */
public class A127194 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127194() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
