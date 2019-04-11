package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281151 <code>a(n) = floor(4*n*(n+1)/5)</code>.
 * @author Sean A. Irvine
 */
public class A281151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281151() {
    super(new long[] {1, -2, 1, 0, 0, -1, 2}, new long[] {0, 1, 4, 9, 16, 24, 33});
  }
}
