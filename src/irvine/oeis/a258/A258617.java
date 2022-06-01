package irvine.oeis.a258;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A258617 a(n) = (4*n+8)*n^2.
 * @author Sean A. Irvine
 */
public class A258617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258617() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 12, 64, 180});
  }
}
