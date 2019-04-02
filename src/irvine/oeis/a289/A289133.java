package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289133 a(n) is the number of odd integers divisible by 9 in ]2*(n-1)^2, 2*n^2[.
 * @author Sean A. Irvine
 */
public class A289133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289133() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
  }
}
