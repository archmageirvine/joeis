package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A273315 First differences of number of active (ON, black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 643", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273315 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A273315() {
    super(0, new long[] {4, 4, 4, -4},
      new long[] {1, -2, 1});
  }
}
