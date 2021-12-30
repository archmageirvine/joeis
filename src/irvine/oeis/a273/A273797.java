package irvine.oeis.a273;
// manually at 2021-12-29 14:50

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a169.A169649;

/**
 * A273797 Partial sums of the number of active (ON,black) cells in n-th stage of growth of two-dimensional cellular automaton defined by "Rule 942", based on the 5-celled von Neumann neighborhood.
 * @author Georg Fischer
 */
public class A273797 extends PartialSumSequence {

  /** Construct the sequence. */
  public A273797() {
    super(new A169649());
    next();
  }
}
