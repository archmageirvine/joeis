package irvine.oeis.a240;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A240277 Minimal number of people such that exactly n days are required to spread gossip.
 * @author Georg Fischer
 */
public class A240277 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A240277() {
    super(0, new long[] {1, -1, 0, -5, 4},
      new long[] {1, -3, 2});
  }
}
