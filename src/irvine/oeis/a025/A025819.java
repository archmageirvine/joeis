package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A025819 Expansion of 1/((1-x^2)(1-x^7)(1-x^11)).
 * @author Georg Fischer
 */
public class A025819 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025819() {
    super(0, new long[] {1},
      new long[] {1, 0, -1, 0, 0, 0, 0, -1, 0, 1, 0, -1, 0, 1, 0, 0, 0, 0, 
      1, 0, -1});
  }
}
