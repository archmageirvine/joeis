package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158224 a(n) = 196*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158224() {
    super(1, new long[] {1, -3, 3}, new long[] {194, 780, 1758});
  }
}
