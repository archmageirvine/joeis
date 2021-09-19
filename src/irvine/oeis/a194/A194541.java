package irvine.oeis.a194;
// manually partsum at 2021-09-13 21:35

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004080;
/**
 * A194541 Partial sums of A004080.
 * @author Georg Fischer
 */
public class A194541 extends PartialSumSequence {

  /** Construct the sequence. */
  public A194541() {
    super(new A004080());
    super.next();
  }
}
