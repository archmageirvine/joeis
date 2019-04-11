package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033577 <code>a(n) = (3*n+1) * (4*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A033577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033577() {
    super(new long[] {1, -3, 3}, new long[] {1, 20, 63});
  }
}
