package irvine.oeis.a032;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A032090 "BHK" (reversible, identity, unlabeled) transform of 0,1,1,1...
 * @author Georg Fischer
 */
public class A032090 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A032090() {
    super(1, new long[] {0, 0, -1, 1, 2, -2, 1, -1, -1},
      new long[] {-1, 2, 1, -3, 1, -1, 0, 1});
  }
}
