package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289139 a(n) is the number of odd integers divisible by 7 in ]4*(n-1)^2, 4*n^2[.
 * @author Sean A. Irvine
 */
public class A289139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289139() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 1, 2, 2, 2, 3, 4});
  }
}
