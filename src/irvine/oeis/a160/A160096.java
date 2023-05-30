package irvine.oeis.a160;
// manually partsum at 2023-05-28 21:45

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a257.A257628;

/**
 * A160096 Partial sums of A010815 starting with offset 1, and signed (+ + - - + + ...).
 * @author Georg Fischer
 */
public class A160096 extends PartialSumSequence {

  /** Construct the sequence. */
  public A160096() {
    super(1, new A257628());
    next();
  }
}
