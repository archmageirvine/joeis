package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103623 n^9 + n^8 + n^7 + n^6 + n^5 + n^4 + n^3 + n^2 + n + 1.
 * @author Sean A. Irvine
 */
public class A103623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103623() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 10, 1023, 29524, 349525, 2441406, 12093235, 47079208, 153391689, 435848050});
  }
}
