package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099132 Quintisection of <code>1/(1-x^5-x^6)</code>.
 * @author Sean A. Irvine
 */
public class A099132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099132() {
    super(new long[] {1, 1, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
