package irvine.oeis.a212;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A212836 Number of 0..n arrays of length 3 with 0 never adjacent to n.
 * @author Georg Fischer
 */
public class A212836 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A212836() {
    super(1, new long[] {0, 2, 9, -6, 1},
      new long[] {1, -4, 6, -4, 1});
  }
}
