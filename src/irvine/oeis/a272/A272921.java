package irvine.oeis.a272;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A272921 Number of active (ON, black) cells at stage 2^n-1 of the two-dimensional cellular automaton defined by "Rule 555", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A272921 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A272921() {
    super(0, new long[] {1, -5, 14, -16, -32, 32},
      new long[] {1, -10, 35, -50, 24});
  }
}
