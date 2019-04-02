package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228392 The number of permutations of length n sortable by 2 block transpositions.
 * @author Sean A. Irvine
 */
public class A228392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228392() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 23, 89, 295, 827});
  }
}
