package irvine.oeis.a133;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A133161 Indices of the triangular numbers which are also centered triangular number.
 * @author Sean A. Irvine
 */
public class A133161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133161() {
    super(1, new long[] {1, -5, 5}, new long[] {1, 4, 16});
  }
}
