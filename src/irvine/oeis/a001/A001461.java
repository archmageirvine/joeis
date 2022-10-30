package irvine.oeis.a001;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006206;

/**
 * A001461 Partial sums of A006206.
 * @author Sean A. Irvine
 */
public class A001461 extends PartialSumSequence {

  /** Construct the sequence. */
  public A001461() {
    super(1, new A006206());
  }
}
