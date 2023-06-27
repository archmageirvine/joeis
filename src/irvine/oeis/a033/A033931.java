package irvine.oeis.a033;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A033931 a(n) = lcm(n,n+1,n+2).
 * @author Sean A. Irvine
 */
public class A033931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033931() {
    super(1, new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {6, 12, 60, 60, 210, 168, 504, 360});
  }
}
