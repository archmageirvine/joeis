package irvine.oeis.a063;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A063522 a(n) = n*(5*n^2 - 3)/2.
 * @author Sean A. Irvine
 */
public class A063522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063522() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 17, 63});
  }
}
