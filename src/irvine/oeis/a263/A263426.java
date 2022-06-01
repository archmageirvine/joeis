package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263426 Permutation of the nonnegative integers: [4k+2, 4k+1, 4k, 4k+3, ...].
 * @author Sean A. Irvine
 */
public class A263426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263426() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 1, 0, 3});
  }
}
