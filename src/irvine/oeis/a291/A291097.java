package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291097 a(n) = 2^n*(n/8 + 1) - n.
 * @author Sean A. Irvine
 */
public class A291097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291097() {
    super(2, new long[] {-4, 12, -13, 6}, new long[] {3, 8, 20, 47});
  }
}
