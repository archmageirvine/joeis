package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A143097 3*k - 2 interleaved with 3*k - 1 and 3*k.
 * @author Georg Fischer
 */
public class A143097 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143097() {
    super(1, new long[] {0, 1, 1, 2, -2, 1},
      new long[] {1, -1, 0, -1, 1});
  }
}
