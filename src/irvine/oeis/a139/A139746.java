package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139746 a(n) = 11^n - 8^n.
 * @author Sean A. Irvine
 */
public class A139746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139746() {
    super(new long[] {-88, 19}, new long[] {0, 3});
  }
}
