package irvine.oeis.a173;
// manually partsum at 2021-09-28

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a006.A006820;

/**
 * A173758 Partial sums of A006820.
 * @author Georg Fischer
 */
public class A173758 extends PartialSumSequence {

  /** Construct the sequence. */
  public A173758() {
    super(new A006820());
  }
}
