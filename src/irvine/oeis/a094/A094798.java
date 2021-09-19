package irvine.oeis.a094;
// manually partsum at 2021-09-13 21:26

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a268.A268643;
/**
 * A094798 Number of times 1 is used in writing out all the numbers 1 through n.
 * @author Georg Fischer
 */
public class A094798 extends PartialSumSequence {

  /** Construct the sequence. */
  public A094798() {
    super(new A268643());
    super.next();
  }
}
