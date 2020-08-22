package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289199 a(n) is the number of odd integers divisible by 13 in the open interval (12*(n-1)^2, 12*n^2).
 * @author Sean A. Irvine
 */
public class A289199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289199() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 0, 2, 2, 3, 5, 5, 6, 7, 7, 9, 10, 10, 12});
  }
}
