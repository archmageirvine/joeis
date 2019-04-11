package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157505 <code>a(n) = 1458*n + 18</code>.
 * @author Sean A. Irvine
 */
public class A157505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157505() {
    super(new long[] {-1, 2}, new long[] {1476, 2934});
  }
}
