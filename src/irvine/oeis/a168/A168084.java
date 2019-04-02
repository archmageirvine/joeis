package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168084 Fibonacci 13-step numbers.
 * @author Sean A. Irvine
 */
public class A168084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168084() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
