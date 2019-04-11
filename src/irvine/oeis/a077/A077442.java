package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077442 <code>2*a(n)^2 + 7</code> is a square.
 * @author Sean A. Irvine
 */
public class A077442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077442() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 3, 9, 19});
  }
}
