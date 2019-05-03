package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117856 Number of palindromes of length <code>n (in</code> base <code>4)</code>.
 * @author Sean A. Irvine
 */
public class A117856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117856() {
    super(new long[] {4, 0}, new long[] {3, 3});
  }
}
