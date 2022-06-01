package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293611 a(n) = (25*n + 41)*Pochhammer(n, 5) / 6!.
 * @author Sean A. Irvine
 */
public class A293611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293611() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 11, 91, 406, 1316, 3486, 8022});
  }
}
