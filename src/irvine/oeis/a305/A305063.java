package irvine.oeis.a305;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A305063 a(n) = 110*2^n + 118.
 * @author Georg Fischer
 */
public class A305063 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A305063() {
    super(0, new long[] {228, -346},
      new long[] {1, -3, 2});
  }
}
