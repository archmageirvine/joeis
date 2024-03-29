package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A126899 Coordination sequence for 6-dimensional cyclotomic lattice Z[zeta_9].
 * @author Georg Fischer
 */
public class A126899 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126899() {
    super(0, new long[] {1, 3, 6, 7, 6, 3, 1},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
