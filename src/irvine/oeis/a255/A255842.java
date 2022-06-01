package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255842 a(n) = 2*n^2 + 12.
 * @author Sean A. Irvine
 */
public class A255842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255842() {
    super(new long[] {1, -3, 3}, new long[] {12, 14, 20});
  }
}
