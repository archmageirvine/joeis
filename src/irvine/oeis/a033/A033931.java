package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033931 <code>a(n) =</code> lcm(n,n+1,n+2).
 * @author Sean A. Irvine
 */
public class A033931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033931() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {6, 12, 60, 60, 210, 168, 504, 360});
  }
}
