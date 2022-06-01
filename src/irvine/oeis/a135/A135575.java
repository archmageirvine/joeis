package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135575 a(n) = A135574(n+1) - 2*A135574(n).
 * @author Sean A. Irvine
 */
public class A135575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135575() {
    super(new long[] {-2, -1, -2, -1, -2}, new long[] {0, 3, -5, 9, -16});
  }
}
