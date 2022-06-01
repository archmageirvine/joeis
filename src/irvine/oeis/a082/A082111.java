package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082111 a(n) = n^2 + 5*n + 1.
 * @author Sean A. Irvine
 */
public class A082111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082111() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 15});
  }
}
