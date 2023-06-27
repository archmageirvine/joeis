package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168082 Fibonacci 11-step numbers.
 * @author Sean A. Irvine
 */
public class A168082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168082() {
    super(1, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
