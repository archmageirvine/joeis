package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164870 The number of permutations of length n that can be sorted by 2 pop stacks in parallel.
 * @author Sean A. Irvine
 */
public class A164870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164870() {
    super(new long[] {6, -10, 6}, new long[] {1, 2, 6});
  }
}
