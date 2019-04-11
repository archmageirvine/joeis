package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033566 <code>a(n) = (2*n+1) * (4*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A033566 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033566() {
    super(new long[] {1, -3, 3}, new long[] {-1, 9, 35});
  }
}
