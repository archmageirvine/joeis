package irvine.oeis.a265;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A265044 Poincar\u00e9 series for hyperbolic reflection group with Coxeter diagram o---o-(5)-o---o.
 * @author Georg Fischer
 */
public class A265044 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A265044() {
    super(0, new long[] {1, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 1},
      new long[] {1, -2, 1, 0, -1, 2, -2, 1, 0, -1, 2, -1});
  }
}
