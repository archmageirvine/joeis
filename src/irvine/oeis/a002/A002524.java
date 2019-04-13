package irvine.oeis.a002;

import irvine.oeis.RatPolyGfSequence;

/**
 * A002524 Number of permutations of length n within distance 2 of a fixed permutation.
 * @author Sean A. Irvine
 */
public class A002524 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A002524() {
    super(new long[] {1, -1}, new long[] {1, -2, 0, -2, 0, 1});
  }
}
