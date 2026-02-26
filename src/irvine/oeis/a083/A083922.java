package irvine.oeis.a083;

import irvine.oeis.PartialSumSequence;

/**
 * A083922 Partial sums of A083921.
 * @author Sean A. Irvine
 */
public class A083922 extends PartialSumSequence {

  /** Construct the sequence. */
  public A083922() {
    super(1, new A083921());
  }
}

