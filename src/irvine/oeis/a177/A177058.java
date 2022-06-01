package irvine.oeis.a177;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A177058 a(n) = n^3 - 3n^2 + 3.
 * @author Sean A. Irvine
 */
public class A177058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177058() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 1, -1, 3});
  }
}
