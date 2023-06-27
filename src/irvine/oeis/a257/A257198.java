package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257198 Number of permutations of length n having exactly one descent such that the first element of the permutation is an odd number.
 * @author Sean A. Irvine
 */
public class A257198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257198() {
    super(1, new long[] {2, -3, -1, 3}, new long[] {0, 0, 2, 6});
  }
}
