package irvine.oeis.a189;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A189450 Number of 2 X n array permutations with each element moving zero or one space horizontally or diagonally.
 * @author Georg Fischer
 */
public class A189450 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A189450() {
    super(1, new long[] {0, 1, 1, -4, 1},
      new long[] {1, -4, 0, 4, -1});
  }
}
