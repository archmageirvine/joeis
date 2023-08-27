package irvine.oeis.a190;
// manually arderiv/partsum at 2023-08-26 10:05

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003415;

/**
 * A190121 Partial sums of the arithmetic derivative function A003415.
 * @author Georg Fischer
 */
public class A190121 extends PartialSumSequence {

  /** Construct the sequence. */
  public A190121() {
    super(1, new A003415());
    super.next();
  }
}
