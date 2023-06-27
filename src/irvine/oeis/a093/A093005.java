package irvine.oeis.a093;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A093005 a(n) = n * ceiling(n/2).
 * @author Sean A. Irvine
 */
public class A093005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093005() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 6, 8, 15});
  }
}
