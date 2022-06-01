package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099131 Quintisection and binomial transform of 1/(1-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A099131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099131() {
    super(new long[] {1, -4, 10, -10, 5}, new long[] {1, 1, 1, 1, 2});
  }
}
