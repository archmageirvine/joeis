package irvine.oeis.a239;
// manually partsum at 2023-05-04 08:23

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a061.A061019;

/**
 * A239122 Partial sums of A061019.
 * @author Georg Fischer
 */
public class A239122 extends PartialSumSequence {

  /** Construct the sequence. */
  public A239122() {
    super(1, new A061019());
  }
}
