package irvine.oeis.a060;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A060533 Number of homeomorphically irreducible multigraphs (or series-reduced multigraphs or multigraphs without nodes of degree 2) on 3 labeled nodes.
 * @author Georg Fischer
 */
public class A060533 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A060533() {
    super(0, new long[] {-1, 0, 6, -11, 3, 6, -7, 3},
      new long[] {-1, 3, -3, 1});
  }
}
