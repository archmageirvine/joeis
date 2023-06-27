package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217530 a(n) = n^4/2-5*n^3/2+21*n-30.
 * @author Sean A. Irvine
 */
public class A217530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217530() {
    super(2, new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 22, 75, 204});
  }
}
