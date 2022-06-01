package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157081 a(n) = 32805000*n^2 + 16200*n + 1.
 * @author Sean A. Irvine
 */
public class A157081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157081() {
    super(new long[] {1, -3, 3}, new long[] {32821201, 131252401, 295293601});
  }
}
