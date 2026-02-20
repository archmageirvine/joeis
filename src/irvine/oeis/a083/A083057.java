package irvine.oeis.a083;

import irvine.oeis.PartialSumSequence;

/**
 * A083057 Partial sums of A083056.
 * @author Sean A. Irvine
 */
public class A083057 extends PartialSumSequence {

  /** Construct the sequence. */
  public A083057() {
    super(1, new A083056());
  }
}

