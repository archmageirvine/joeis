package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098547 a(n) = n^3 + n^2 + 1.
 * @author Sean A. Irvine
 */
public class A098547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098547() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 13, 37});
  }
}
