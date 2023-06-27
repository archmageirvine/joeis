package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157336 a(n) = 8*(8*n + 1).
 * @author Sean A. Irvine
 */
public class A157336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157336() {
    super(1, new long[] {-1, 2}, new long[] {72, 136});
  }
}
