package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129029 a(n) = 8*n^4+44*n^3+106*n^2+100*n+30.
 * @author Sean A. Irvine
 */
public class A129029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129029() {
    super(-1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 30, 288, 1134, 3120});
  }
}
