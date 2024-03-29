package irvine.oeis.a126;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A126920 Coordination sequence for 18-dimensional cyclotomic lattice Z[zeta_27].
 * @author Georg Fischer
 */
public class A126920 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A126920() {
    super(0, new long[] {1, 0, 0, 9, 0, 0, 36, 0, 0, 84, 0, 0, 126, 0, 0, 126, 0, 
      0, 84, 0, 0, 36, 0, 0, 9, 0, 0, 1},
      new long[] {1, -18, 153, -816, 3060, -8568, 18564, -31824, 43758, -48620, 43758, 
      -31824, 18564, -8568, 3060, -816, 153, -18, 1});
  }
}
