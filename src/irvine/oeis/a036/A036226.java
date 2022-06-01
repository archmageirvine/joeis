package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036226 Expansion of 1/(1-7*x)^7.
 * @author Sean A. Irvine
 */
public class A036226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036226() {
    super(new long[] {823543, -823543, 352947, -84035, 12005, -1029, 49}, new long[] {1, 49, 1372, 28812, 504210, 7764834, 108707676});
  }
}
