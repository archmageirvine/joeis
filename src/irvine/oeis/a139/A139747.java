package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139747 a(n) = 11^n - 9^n.
 * @author Sean A. Irvine
 */
public class A139747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139747() {
    super(new long[] {-99, 20}, new long[] {0, 2});
  }
}
