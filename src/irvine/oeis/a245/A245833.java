package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245833 The Szeged index of the triangle-shaped benzenoid T_n (see Fig. 5.7 of the Diudea et al. reference).
 * @author Georg Fischer
 */
public class A245833 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245833() {
    super(1, new long[] {0, 54, 162, -36},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
