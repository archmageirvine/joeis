package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117855 Number of nonzero palindromes of length n (in base 3).
 * @author Sean A. Irvine
 */
public class A117855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117855() {
    super(1, new long[] {3, 0}, new long[] {2, 2});
  }
}
