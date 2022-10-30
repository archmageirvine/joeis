package irvine.oeis.a182;
// manually partsum at 2021-09-13 21:26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a066.A066186;
/**
 * A182738 Partial sums of A066186.
 * @author Georg Fischer
 */
public class A182738 extends PartialSumSequence {

  /** Construct the sequence. */
  public A182738() {
    super(1, new A066186());
    super.next();
  }
}
