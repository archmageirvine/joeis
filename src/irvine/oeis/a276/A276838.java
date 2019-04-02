package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276838 Number of permutations of [n] such that for each cycle c the smallest integer interval containing all elements of c has at most four elements.
 * @author Sean A. Irvine
 */
public class A276838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276838() {
    super(new long[] {-1, -5, -2, 8, 12, 2, 2, 1}, new long[] {1, 1, 2, 6, 24, 60, 150, 399});
  }
}
