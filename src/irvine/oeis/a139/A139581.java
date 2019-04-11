package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139581 <code>a(n) = n*(2*n + 19)</code>.
 * @author Sean A. Irvine
 */
public class A139581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139581() {
    super(new long[] {1, -3, 3}, new long[] {0, 21, 46});
  }
}
