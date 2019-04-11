package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139740 <code>11^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A139740 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139740() {
    super(new long[] {-22, 13}, new long[] {0, 9});
  }
}
