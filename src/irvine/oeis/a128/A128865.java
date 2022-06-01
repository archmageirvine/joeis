package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128865 Number of n-tuples where each entry is chosen from the subsets of {1,2,3,4} such that the intersection of all n entries contains exactly one element.
 * @author Sean A. Irvine
 */
public class A128865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128865() {
    super(new long[] {-64, 120, -70, 15}, new long[] {4, 108, 1372, 13500});
  }
}
