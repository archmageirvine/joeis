package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153169 a(n) = 4*n^2 + 12*n + 3.
 * @author Sean A. Irvine
 */
public class A153169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153169() {
    super(1, new long[] {1, -3, 3}, new long[] {19, 43, 75});
  }
}
