package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263449 Permutation of the natural numbers: [4k+1, 4k+4, 4k+3, 4k+2, ...].
 * @author Sean A. Irvine
 */
public class A263449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263449() {
    super(new long[] {-1, 2, -2, 2}, new long[] {1, 4, 3, 2});
  }
}
