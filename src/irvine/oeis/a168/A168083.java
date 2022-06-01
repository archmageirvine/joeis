package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168083 Fibonacci 12-step numbers.
 * @author Sean A. Irvine
 */
public class A168083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168083() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
