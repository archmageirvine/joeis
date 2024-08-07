package irvine.oeis.a270;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A270218 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 129", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A270218 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A270218() {
    super(0, new long[] {1, -3, 14, -8},
      new long[] {1, -7, 14, -8});
  }
}
