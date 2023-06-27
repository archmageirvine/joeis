package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157734 a(n) = 441*n^2 - 394*n + 88.
 * @author Sean A. Irvine
 */
public class A157734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157734() {
    super(1, new long[] {1, -3, 3}, new long[] {135, 1064, 2875});
  }
}
