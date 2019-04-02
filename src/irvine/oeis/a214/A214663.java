package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214663 Number of permutations of 1..n for which the partial sums of signed displacements do not exceed 2.
 * @author Sean A. Irvine
 */
public class A214663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214663() {
    super(new long[] {1, 3, 1, 1}, new long[] {1, 1, 2, 6});
  }
}
