package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153234 a(n) = floor(2^n/9).
 * @author Sean A. Irvine
 */
public class A153234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153234() {
    super(new long[] {-2, 3, -1, -2, 3}, new long[] {0, 0, 0, 0, 1});
  }
}
