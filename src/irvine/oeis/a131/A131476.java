package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131476 <code>a(n) = floor(n^3/3)</code>.
 * @author Sean A. Irvine
 */
public class A131476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131476() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 0, 2, 9, 21, 41});
  }
}
