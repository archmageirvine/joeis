package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117855 Number of nonzero palindromes of length <code>n (in</code> base 3).
 * @author Sean A. Irvine
 */
public class A117855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117855() {
    super(new long[] {3, 0}, new long[] {2, 2});
  }
}
