package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117859 Number of palindromes of length <code>n</code> (in base <code>7)</code>.
 * @author Sean A. Irvine
 */
public class A117859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117859() {
    super(new long[] {7, 0}, new long[] {6, 6});
  }
}
