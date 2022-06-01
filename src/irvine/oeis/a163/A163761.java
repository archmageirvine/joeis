package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163761 a(n) = 10*n*(n+1).
 * @author Sean A. Irvine
 */
public class A163761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163761() {
    super(new long[] {1, -3, 3}, new long[] {0, 20, 60});
  }
}
