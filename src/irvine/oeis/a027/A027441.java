package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027441 <code>a(n) = (n^4 + n)/2, (Row</code> sums of an <code>n X n X n</code> magic cube, when it <code>exists)</code>.
 * @author Sean A. Irvine
 */
public class A027441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027441() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 9, 42, 130});
  }
}
