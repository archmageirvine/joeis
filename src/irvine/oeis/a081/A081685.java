package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081685 a(n) = 6^n - 5^n - 4^n - 3^n + 3*2^n.
 * @author Sean A. Irvine
 */
public class A081685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081685() {
    super(new long[] {720, -1044, 580, -155, 20}, new long[] {1, 0, -2, 24, 382});
  }
}
