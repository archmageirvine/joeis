package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139578 <code>a(n) = n(2n+13)</code>.
 * @author Sean A. Irvine
 */
public class A139578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139578() {
    super(new long[] {1, -3, 3}, new long[] {0, 15, 34});
  }
}
