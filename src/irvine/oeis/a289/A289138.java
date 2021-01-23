package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289138 a(n) = smallest expomorphic number in base n: least integer k such that n^k ends in k, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A289138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289138() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 36, 7, 6, 5, 6, 3, 56, 9, 0, 1, 16, 7, 6, 5, 6, 3, 76, 9, 0, 1, 96, 7, 6, 5, 6, 3, 96, 9, 0, 1, 76, 7, 6, 5, 6, 3, 16, 9, 0, 1, 56, 7, 6, 5, 6, 3, 36, 9, 0});
  }
}
