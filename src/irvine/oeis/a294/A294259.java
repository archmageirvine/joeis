package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294259 <code>a(n) = n*(n^3 + 2*n^2 - 5*n + 10)/8</code>.
 * @author Sean A. Irvine
 */
public class A294259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294259() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 4, 15, 43});
  }
}
