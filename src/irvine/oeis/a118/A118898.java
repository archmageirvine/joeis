package irvine.oeis.a118;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A118898 Number of binary sequences of length n containing exactly one subsequence 0000.
 * @author Sean A. Irvine
 */
public class A118898 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118898() {
    super(new long[] {-1, -2, -3, -4, -1, 0, 1, 2}, new long[] {0, 0, 0, 0, 1, 2, 5, 12});
  }
}
