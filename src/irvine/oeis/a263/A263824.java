package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263824 Permutation of the nonnegative integers: [6k+3, 6k+4, 6k+5, 6k, 6k+1, 6k+2, ...].
 * @author Sean A. Irvine
 */
public class A263824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263824() {
    super(new long[] {-1, 2, -1, -1, 2}, new long[] {3, 4, 5, 0, 1});
  }
}
