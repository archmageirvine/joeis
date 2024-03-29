package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221543 Number of 0..n arrays of length 5 with each element differing from at least one neighbor by something other than 1, starting with 0.
 * @author Georg Fischer
 */
public class A221543 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A221543() {
    super(1, new long[] {0, 3, 7, 23, -22, 26, -18, 6, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
