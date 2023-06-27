package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158730 a(n) = 68*n^2 - 1.
 * @author Sean A. Irvine
 */
public class A158730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158730() {
    super(1, new long[] {1, -3, 3}, new long[] {67, 271, 611});
  }
}
