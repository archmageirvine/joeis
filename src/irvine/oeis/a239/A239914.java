package irvine.oeis.a239;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000670;

/**
 * A239914 Total number of preferential arrangements of 1, 2, ..., n things.
 * @author Georg Fischer
 */
public class A239914 extends PartialSumSequence {

  /** Construct the sequence. */
  public A239914() {
    super(1, new SkipSequence(new A000670(), 1));
  }
}
