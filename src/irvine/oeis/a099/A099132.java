package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099132 Quintisection of 1/(1-x^5-x^6).
 * @author Sean A. Irvine
 */
public class A099132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099132() {
    super(new long[] {1, 1, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
