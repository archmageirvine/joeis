package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157111 a(n) = 137842*n - 106846.
 * @author Sean A. Irvine
 */
public class A157111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157111() {
    super(new long[] {-1, 2}, new long[] {30996, 168838});
  }
}
