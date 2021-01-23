package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128833 Number of n-tuples where each entry is chosen from the subsets of {1,2,3,4,5} such that the intersection of all n entries is empty.
 * @author Sean A. Irvine
 */
public class A128833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128833() {
    super(new long[] {-32768, 64512, -41664, 11160, -1302, 63}, new long[] {1, 243, 16807, 759375, 28629151, 992436543});
  }
}
