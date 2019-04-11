package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071289 If <code>n mod 2 = 0</code> then <code>n*(n^2+1)</code> else <code>(n-1/2)*(n^2+1)</code>.
 * @author Sean A. Irvine
 */
public class A071289 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071289() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 1, 10, 25, 68, 117, 222});
  }
}
