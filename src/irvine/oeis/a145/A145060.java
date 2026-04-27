package irvine.oeis.a145;
// manually 2026-04-26/partsun at 2026-04-26 21:33

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a031.A031443;

/**
 * A145060 Cumulative sums of A031443.
 * @author Georg Fischer
 */
public class A145060 extends PartialSumSequence {

  /** Construct the sequence. */
  public A145060() {
    super(1, new A031443());
    next();
  }
}
