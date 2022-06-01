package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104449 Fibonacci sequence with initial values a(0) = 3 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A104449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104449() {
    super(new long[] {1, 1}, new long[] {3, 1});
  }
}
