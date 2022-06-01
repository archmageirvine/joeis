package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022521 a(n) = (n+1)^5 - n^5.
 * @author Sean A. Irvine
 */
public class A022521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022521() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 31, 211, 781, 2101});
  }
}
