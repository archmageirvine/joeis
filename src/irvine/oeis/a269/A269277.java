package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269277 Number of 2 X n 0..3 arrays with some element plus some horizontally or antidiagonally adjacent neighbor totalling three exactly once.
 * @author Georg Fischer
 */
public class A269277 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269277() {
    super(1, new long[] {0, 0, 108, -144, 36},
      new long[] {1, -14, 49});
  }
}
