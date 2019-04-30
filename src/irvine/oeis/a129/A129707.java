package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129707 Number of inversions in all Fibonacci binary words of length n. A Fibonacci binary word is a binary word having no 00 subword.
 * @author Sean A. Irvine
 */
public class A129707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129707() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 1, 4, 12, 31});
  }
}
