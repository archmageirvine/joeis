package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A143402 Expansion of x^k/Product_{t=k..2k} (1-tx) for k=7.
 * @author Georg Fischer
 */
public class A143402 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143402() {
    super(0, new long[] {0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, -84, 3066, -63504, 816249, -6666156, 33775244, -97053936, 121080960});
  }
}
