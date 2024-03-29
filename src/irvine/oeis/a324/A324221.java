package irvine.oeis.a324;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A324221 Number of connected 2n-regular loopless multigraphs with five nodes.
 * @author Georg Fischer
 */
public class A324221 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A324221() {
    super(0, new long[] {0, 1, 3, -1, 4, -1, 6, 0, 4, -1, -1, 1},
      new long[] {1, -3, 2, 1, -1, 2, -4, 2, -1, 1, 2, -3, 1});
  }
}
