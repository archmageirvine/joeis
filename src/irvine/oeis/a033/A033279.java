package irvine.oeis.a033;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A033279 Number of diagonal dissections of an n-gon into 7 regions.
 * @author Georg Fischer
 */
public class A033279 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A033279() {
    super(8, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 429, -572, 429, -208, 65, -12, 1},
      new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 
      13, -1});
  }
}
