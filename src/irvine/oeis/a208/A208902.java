package irvine.oeis.a208;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A208902 The sum over all bitstrings b of length n of the number of runs in b not immediately followed by a longer run.
 * @author Sean A. Irvine
 */
public class A208902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208902() {
    super(new long[] {-8, 16, -6, -6, 5}, new long[] {2, 6, 14, 34, 78});
  }
}
