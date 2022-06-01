package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081685 A sum of decreasing powers.
 * @author Sean A. Irvine
 */
public class A081685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081685() {
    super(new long[] {720, -1044, 580, -155, 20}, new long[] {1, 0, -2, 24, 382});
  }
}
