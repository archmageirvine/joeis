package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128831 Number of n-tuples where each entry is chosen from the subsets of <code>{1,2,3}</code> such that the intersection of all n entries is empty.
 * @author Sean A. Irvine
 */
public class A128831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128831() {
    super(new long[] {-64, 120, -70, 15}, new long[] {1, 27, 343, 3375});
  }
}
