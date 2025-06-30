package irvine.oeis.a076;

import irvine.oeis.PartialSumSequence;

/**
 * A076499 Partial sums of A076498.
 * @author Sean A. Irvine
 */
public class A076499 extends PartialSumSequence {

  /** Construct the sequence. */
  public A076499() {
    super(1, new A076498());
  }
}
