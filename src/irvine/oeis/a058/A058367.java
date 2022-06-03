package irvine.oeis.a058;

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A058367 Number of ways to cover (without overlapping) a ring lattice (necklace) of n sites with molecules that are 6 sites wide.
 * @author Georg Fischer
 */
public class A058367 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A058367() {
    super(1, new long[] {0, 1, 0, 0, 0, 0, 6},
      new long[] {1, -1, 0, 0, 0, 0, -1});
  }
}
