package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082041 a(n) = 16*n^2 + 4*n + 1.
 * @author Sean A. Irvine
 */
public class A082041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082041() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 73});
  }
}
