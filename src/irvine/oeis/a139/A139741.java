package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139741 a(n) = 11^n - 3^n.
 * @author Sean A. Irvine
 */
public class A139741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139741() {
    super(new long[] {-33, 14}, new long[] {0, 8});
  }
}
