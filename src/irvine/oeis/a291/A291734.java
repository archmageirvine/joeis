package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291734 p-INVERT of (1,0,1,0,0,0,0,...), where p(S) = (1 - S)(1 - 2 S).
 * @author Sean A. Irvine
 */
public class A291734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291734() {
    super(new long[] {-2, 0, -4, 3, -2, 3}, new long[] {3, 7, 18, 45, 108, 258});
  }
}
