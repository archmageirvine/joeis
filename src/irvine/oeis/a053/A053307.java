package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053307 Number of nonnegative integer 2 X 2 matrices with sum of elements equal to n, under row and column permutations.
 * @author Sean A. Irvine
 */
public class A053307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053307() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {1, 1, 4, 5, 11, 14});
  }
}
