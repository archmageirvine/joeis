package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158738 a(n) = 72*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158738() {
    super(1, new long[] {1, -3, 3}, new long[] {71, 287, 647});
  }
}
