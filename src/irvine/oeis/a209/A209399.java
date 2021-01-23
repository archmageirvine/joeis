package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209399 Number of subsets of {1,...,n} containing two elements whose difference is 3.
 * @author Sean A. Irvine
 */
public class A209399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209399() {
    super(new long[] {2, 1, -3, -1, -1, 3, -3, -1, 3}, new long[] {0, 0, 0, 0, 4, 14, 37, 83, 181});
  }
}
