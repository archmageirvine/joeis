package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157374 a(n) = 343*n - 70.
 * @author Sean A. Irvine
 */
public class A157374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157374() {
    super(1, new long[] {-1, 2}, new long[] {273, 616});
  }
}
