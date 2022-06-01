package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139620 a(n) = 190*n + 20.
 * @author Sean A. Irvine
 */
public class A139620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139620() {
    super(new long[] {-1, 2}, new long[] {20, 210});
  }
}
