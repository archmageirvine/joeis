package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117857 Number of palindromes of length <code>n (in</code> base <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A117857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117857() {
    super(new long[] {5, 0}, new long[] {4, 4});
  }
}
