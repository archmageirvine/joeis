package irvine.oeis.a063;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A063263 Ninth column (k=8) of sextinomial array A063260.
 * @author Georg Fischer
 */
public class A063263 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A063263() {
    super(0, new long[] {3, 0, -10, 15, -9, 2},
      new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9, -1});
  }
}
