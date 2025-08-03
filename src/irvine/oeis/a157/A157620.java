package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157620 a(n) = 781250*n^2 - 1107500*n + 392499.
 * @author Sean A. Irvine
 */
public class A157620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157620() {
    super(1, new long[] {1, -3, 3}, new long[] {66249, 1302499, 4101249});
  }
}
