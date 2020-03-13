package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033589 <code>a(n) = (2*n-1)*(3*n-1)*(4*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A033589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033589() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 6, 105, 440});
  }
}
