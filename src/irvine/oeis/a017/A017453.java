package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017453 a(n) = (11*n + 5)^5.
 * @author Sean A. Irvine
 */
public class A017453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017453() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 1048576, 14348907, 79235168, 282475249, 777600000});
  }
}
