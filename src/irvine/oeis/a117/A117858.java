package irvine.oeis.a117;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A117858 Number of palindromes of length n (in base 6).
 * @author Sean A. Irvine
 */
public class A117858 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117858() {
    super(1, new long[] {6, 0}, new long[] {5, 5});
  }
}
