package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108649.
 * @author Sean A. Irvine
 */
public class A108649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108649() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 17, 111, 457, 1428, 3710, 8442});
  }
}
