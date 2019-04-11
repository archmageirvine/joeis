package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131728 <code>a(4n) = n, a(4n+1) = 2n+1, a(4n+2) = n+1, a(4n+3) = 0</code>.
 * @author Sean A. Irvine
 */
public class A131728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131728() {
    super(new long[] {-1, 2, -3, 4, -3, 2}, new long[] {0, 1, 1, 0, 1, 3});
  }
}
