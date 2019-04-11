package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272298 <code>a(n) = n^4 + 324</code>.
 * @author Sean A. Irvine
 */
public class A272298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272298() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {324, 325, 340, 405, 580});
  }
}
