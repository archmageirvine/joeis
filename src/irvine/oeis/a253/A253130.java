package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253130 Number of length 2+2 0..n arrays with the sum of medians of adjacent triples multiplied by some arrangement of +-1 equal to zero.
 * @author Georg Fischer
 */
public class A253130 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A253130() {
    super(1, new long[] {0, 12, -7, 7, -5, 1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
