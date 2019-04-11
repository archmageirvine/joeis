package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263313 Permutation of the nonnegative integers: <code>[4k+3, 4k, 4k+1, 4k+2, ...]</code>.
 * @author Sean A. Irvine
 */
public class A263313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263313() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 0, 1, 2, 7});
  }
}
