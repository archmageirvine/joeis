package irvine.oeis.a182;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A182531 Extremal graph numbers for a triangle with an edge off it.
 * @author Georg Fischer
 */
public class A182531 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A182531() {
    super(1, new long[] {0, 0, 1, 1, -2, 0, 2, -1},
      new long[] {1, -2, 0, 2, -1});
  }
}
