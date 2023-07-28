package irvine.oeis.a138;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a092.A092892;

/**
 * A138847 Row sums of a Collatz triangle.
 * @author Georg Fischer
 */
public class A138847 extends PartialSumSequence {

  /** Construct the sequence. */
  public A138847() {
    super(0, new A092892());
  }

}
