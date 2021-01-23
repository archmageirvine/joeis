package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289122 a(n) is number of odd integers divisible by 11 in the interval ]2*(n-1)^2, 2*n^2[.
 * @author Sean A. Irvine
 */
public class A289122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289122() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 0, 1, 1, 1, 2, 1, 2, 2});
  }
}
