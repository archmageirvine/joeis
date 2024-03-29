package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A126922 Coordination sequence for 8-dimensional cyclotomic lattice Z[zeta_30].
 * @author Georg Fischer
 */
public class A126922 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126922() {
    super(0, new long[] {1, 22, 208, 874, 1480, 874, 208, 22, 1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
