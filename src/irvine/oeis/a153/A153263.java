package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153263 a(n) = A014217(n+3) - A014217(n).
 * @author Sean A. Irvine
 */
public class A153263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153263() {
    super(new long[] {1, 2, 0}, new long[] {3, 5, 9});
  }
}
