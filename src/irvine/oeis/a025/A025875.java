package irvine.oeis.a025;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A025875 Expansion of 1/((1-x^4)*(1-x^11)*(1-x^12)).
 * @author Georg Fischer
 */
public class A025875 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A025875() {
    super(0, new long[] {1},
      new long[] {1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 1, 1, 0, 
      0, 0, 0, 0, 0, 1, 0, 0, 0, -1});
  }
}
