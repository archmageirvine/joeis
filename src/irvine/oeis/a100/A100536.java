package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100536 a(n) = 3*n^2 - 2.
 * @author Sean A. Irvine
 */
public class A100536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100536() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 10, 25});
  }
}
