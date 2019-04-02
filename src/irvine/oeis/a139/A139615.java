package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139615 a(n) = 105*n + 15.
 * @author Sean A. Irvine
 */
public class A139615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139615() {
    super(new long[] {-1, 2}, new long[] {15, 120});
  }
}
