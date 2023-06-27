package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157924 a(n) = 98*n - 1.
 * @author Sean A. Irvine
 */
public class A157924 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157924() {
    super(1, new long[] {-1, 2}, new long[] {97, 195});
  }
}
