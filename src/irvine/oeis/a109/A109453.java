package irvine.oeis.a109;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000030;

/**
 * A109453 Cumulative sum of initial digits of n.
 * @author Georg Fischer
 */
public class A109453 extends PartialSumSequence {

  /** Construct the sequence. */
  public A109453() {
    super(1, new A000030());
    next();
  }
}
