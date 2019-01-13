package irvine.oeis.a160;

import irvine.oeis.LinearRecurrence;

/**
 * A160741.
 * @author Sean A. Irvine
 */
public class A160741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160741() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {-5, 10159, 867211, 10373071, 59271739, 227860495, 683245579});
  }
}
