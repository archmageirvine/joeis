package irvine.oeis.a317;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A317314 Multiples of 14 and odd numbers interleaved.
 * @author Georg Fischer
 */
public class A317314 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A317314() {
    super(0, new long[] {0, 1, 14, 1},
      new long[] {1, 0, -2, 0, 1});
  }
}
