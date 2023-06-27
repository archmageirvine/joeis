package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163980 a(n) = 2*n + (-1)^n.
 * @author Sean A. Irvine
 */
public class A163980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163980() {
    super(1, new long[] {-1, 1, 1}, new long[] {1, 5, 5});
  }
}
