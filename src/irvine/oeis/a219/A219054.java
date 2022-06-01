package irvine.oeis.a219;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A219054 (8*n^3 + 3*n^2 + n) / 6.
 * @author Sean A. Irvine
 */
public class A219054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219054() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 13, 41, 94});
  }
}
