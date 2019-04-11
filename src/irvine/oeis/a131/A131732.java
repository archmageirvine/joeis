package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131732 a(4*k) = 2*k+1, a(4*k+1) = -4*k-3, a(4*k+2) = 2*k+2, a(4*k+3) <code>= 0</code>.
 * @author Sean A. Irvine
 */
public class A131732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131732() {
    super(new long[] {-1, -2, -3, -4, -3, -2}, new long[] {1, -3, 2, 0, 3, -7});
  }
}
