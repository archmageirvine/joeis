package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082643 <code>a(n) = ceiling(n*(n+1/2)/2)</code>.
 * @author Sean A. Irvine
 */
public class A082643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082643() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 3, 6, 9, 14});
  }
}
