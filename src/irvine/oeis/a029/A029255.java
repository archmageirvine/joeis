package irvine.oeis.a029;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A029255 Expansion of 1/((1-x^3)*(1-x^4)*(1-x^6)*(1-x^11)).
 * @author Georg Fischer
 */
public class A029255 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A029255() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, -1, -1, 0, -1, 1, 0, 1, 1, -1, 0, -1, 1, 1, 0, 1, 
      -1, 0, -1, -1, 0, 0, 1});
  }
}
