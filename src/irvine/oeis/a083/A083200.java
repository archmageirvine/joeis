package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083200 Polynexus numbers of order 7.
 * @author Sean A. Irvine
 */
public class A083200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083200() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 17, 118, 514, 1681, 4529});
  }
}
