package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131509 a(n) = (n + 1)*(n^2 + 2)*(n^3 + 3)/6.
 * @author Sean A. Irvine
 */
public class A131509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131509() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 4, 33, 220, 1005, 3456, 9709});
  }
}
