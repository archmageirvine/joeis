package irvine.oeis.a153;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A153266 a(n) = -4*a(n-3) + 11*a(n-2) - a(n-1), a(0) = 13, a(1) = -19, a(2) = 162.
 * @author Sean A. Irvine
 */
public class A153266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153266() {
    super(new long[] {-4, 11, -1}, new long[] {13, -19, 162});
  }
}
