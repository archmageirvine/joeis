package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A273310 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 641", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273310 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A273310() {
    super(0, new long[] {1, -3, 26, -16, -32},
      new long[] {1, -7, 14, -8});
  }
}
