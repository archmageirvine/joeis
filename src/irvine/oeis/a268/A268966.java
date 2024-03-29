package irvine.oeis.a268;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268966 Number of n X 3 0..2 arrays with some element plus some horizontally or antidiagonally adjacent neighbor totalling two not more than once.
 * @author Georg Fischer
 */
public class A268966 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A268966() {
    super(1, new long[] {0, 24, -48},
      new long[] {1, -12, 36});
  }
}
