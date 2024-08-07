package irvine.oeis.a269;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269811 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 33", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A269811 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A269811() {
    super(0, new long[] {1, -5, 21, -39, -30, 36, 40},
      new long[] {1, -9, 25, -15, -26, 24});
  }
}
