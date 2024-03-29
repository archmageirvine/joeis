package irvine.oeis.a229;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A229472 Number of defective 4-colorings of an n X 1 0..3 array connected horizontally, antidiagonally and vertically with exactly one mistake, and colors introduced in row-major 0..3 order.
 * @author Georg Fischer
 */
public class A229472 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A229472() {
    super(1, new long[] {0, 0, 1, -6, 12, -8, 3},
      new long[] {1, -8, 22, -24, 9});
  }
}
