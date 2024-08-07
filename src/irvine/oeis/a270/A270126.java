package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A270126 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 86", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270126 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A270126() {
    super(0, new long[] {1, 1, 4},
      new long[] {1, -4});
  }
}
