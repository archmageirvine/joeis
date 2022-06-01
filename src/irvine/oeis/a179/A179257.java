package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179257 Number of permutations of length n which avoid the patterns 321 and 1324.
 * @author Sean A. Irvine
 */
public class A179257 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179257() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 1, 2, 5, 13, 32});
  }
}
