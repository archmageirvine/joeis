package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261391 a(n) = n^5 + 5*n^3 + 5*n.
 * @author Sean A. Irvine
 */
public class A261391 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261391() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 11, 82, 393, 1364, 3775});
  }
}
