package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A029290 Expansion of 1/((1-x^3)(1-x^5)(1-x^10)(1-x^12)).
 * @author Georg Fischer
 */
public class A029290 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029290() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, -1, 0, -1, 0, 0, 1, 0, -1, 0, -1, 1, 0, 2, 0, 1, 
      -1, 0, -1, 0, 1, 0, 0, -1, 0, -1, 0, 0, 1});
  }
}
