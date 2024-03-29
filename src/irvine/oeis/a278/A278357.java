package irvine.oeis.a278;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A278357 Number of n X 2 0..1 arrays with rows and columns in lexicographic nondecreasing order but with exactly one mistake.
 * @author Georg Fischer
 */
public class A278357 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A278357() {
    super(1, new long[] {0, 1, -2, 7, -8, 3},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
