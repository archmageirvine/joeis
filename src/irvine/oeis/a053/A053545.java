package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053545.
 * @author Sean A. Irvine
 */
public class A053545 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053545() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 1, 5, 19});
  }
}
