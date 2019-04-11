package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017057 <code>a(n) = (7*n + 6)^5</code>.
 * @author Sean A. Irvine
 */
public class A017057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017057() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 371293, 3200000, 14348907, 45435424, 115856201});
  }
}
