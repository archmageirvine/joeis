package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164897 a(n) = 4*n*(n+1) + 3.
 * @author Sean A. Irvine
 */
public class A164897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164897() {
    super(new long[] {1, -3, 3}, new long[] {3, 11, 27});
  }
}
