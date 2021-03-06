package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A269685 Number of length-n 0..3 arrays with no repeated value differing from the previous repeated value by plus or minus one modulo 3+1.
 * @author Georg Fischer
 */
public class A269685 extends GeneratingFunctionSequence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A269685() {
    super(1, new long[] {0, 4, -8, -4},
      new long[] {1, -6, 7, 6});
  }
}
