package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288429 <code>a(n) = 2*a(n-1) - a(n-2) + a(n-3) - a(n-4)</code>, where <code>a(0) = 2, a(1) = 4, a(2) = 5, a(3) = 6</code>.
 * @author Sean A. Irvine
 */
public class A288429 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288429() {
    super(new long[] {-1, 1, -1, 2}, new long[] {2, 4, 5, 6});
  }
}
