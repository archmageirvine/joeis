package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060888 a(n) = n^6 - n^5 + n^4 - n^3 + n^2 - n + 1.
 * @author Sean A. Irvine
 */
public class A060888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060888() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1, 43, 547, 3277, 13021, 39991});
  }
}
