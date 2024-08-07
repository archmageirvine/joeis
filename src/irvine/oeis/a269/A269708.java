package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269708 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 14", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A269708 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269708() {
    super(0, new long[] {1, -2, -3, -4},
      new long[] {1, -7, 12});
  }
}
