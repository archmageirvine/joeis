package irvine.oeis.a272;
// manually at 2021-12-29 14:50

import irvine.oeis.PartialSumSequence;

/**
 * A272282 Partial sums of the number of active (ON, black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 457", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A272282 extends PartialSumSequence {

  /** Construct the sequence. */
  public A272282() {
    super(new A272280());
  }
}
