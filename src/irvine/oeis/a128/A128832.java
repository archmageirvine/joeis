package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128832 Number of n-tuples where each entry is chosen from the subsets of {1,2,3,4} such that the intersection of all n entries is empty.
 * @author Sean A. Irvine
 */
public class A128832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128832() {
    super(new long[] {1024, -1984, 1240, -310, 31}, new long[] {1, 81, 2401, 50625, 923521});
  }
}
