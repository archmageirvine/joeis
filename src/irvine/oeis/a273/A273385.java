package irvine.oeis.a273;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A273385 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 659", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273385 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A273385() {
    super(0, new long[] {1, -2, 28, -56, 32},
      new long[] {1, -7, 14, -8});
  }
}
