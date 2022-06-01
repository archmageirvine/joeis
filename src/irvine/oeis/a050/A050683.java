package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050683 Number of nonzero palindromes of length n.
 * @author Sean A. Irvine
 */
public class A050683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050683() {
    super(new long[] {10, 0}, new long[] {9, 9});
  }
}
