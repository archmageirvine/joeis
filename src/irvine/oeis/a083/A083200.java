package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083200.
 * @author Sean A. Irvine
 */
public class A083200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083200() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 17, 118, 514, 1681, 4529});
  }
}
