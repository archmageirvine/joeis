package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A029114 Expansion of 1/((1-x)*(1-x^6)*(1-x^9)*(1-x^11)).
 * @author Georg Fischer
 */
public class A029114 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029114() {
    super(0, new long[] {1},
      new long[] {1, -1, 0, 0, 0, 0, -1, 1, 0, -1, 1, -1, 1, 0, 0, 1, -1, 1, 
      -1, 0, 1, -1, 0, 0, 0, 0, -1, 1});
  }
}
