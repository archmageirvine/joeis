package irvine.oeis.a058;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A058364 Number of ways to cover (without overlapping) a ring lattice (necklace) of n sites with molecules that are 9 sites wide.
 * @author Georg Fischer
 */
public class A058364 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A058364() {
    super(1, new long[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 9},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, -1});
  }
}
