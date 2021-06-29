package irvine.oeis.a054;
// manually 2021-06-28

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000201;

/**
 * A054347 Partial sums of A000201.
 * @author Georg Fischer
 */
public class A054347 extends PrependSequence {

  /** Construct the sequence. */
  public A054347() {
    super(new PartialSumSequence(new A000201()), 0);
  }
}
