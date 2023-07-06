package irvine.oeis.a178;
// manually partsumm/partsum at 2022-03-24 22:56

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003407;

/**
 * A178155 Partial sums of A003407 (starting at n=1).
 * @author Georg Fischer
 */
public class A178155 extends PartialSumSequence {

  /** Construct the sequence. */
  public A178155() {
    super(1, new A003407().skip(1));
  }
}
