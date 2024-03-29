package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A278670 Number of n X 2 0..1 arrays with rows in nondecreasing lexicographic order and columns in nonincreasing lexicographic order, but with exactly one mistake.
 * @author Georg Fischer
 */
public class A278670 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A278670() {
    super(1, new long[] {0, 1, 1, -2, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
