package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123296 Number of permutations of n distinct letters (ABCD...) each of which appears 5 times and having n-2 fixed points.
 * @author Sean A. Irvine
 */
public class A123296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123296() {
    super(new long[] {1, -3, 3}, new long[] {0, 25, 75});
  }
}
