package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139613 a(n) = 78*n + 13.
 * @author Sean A. Irvine
 */
public class A139613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139613() {
    super(new long[] {-1, 2}, new long[] {13, 91});
  }
}
