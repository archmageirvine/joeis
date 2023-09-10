package irvine.oeis.a174;
// manually robots/partsum at 2023-09-09 10:06

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a065.A065641;

/**
 * A174202 Partial sums of A065641.
 * @author Georg Fischer
 */
public class A174202 extends PartialSumSequence {

  /** Construct the sequence. */
  public A174202() {
    super(1, new A065641());
    super.next();
  }
}
