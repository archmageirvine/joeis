package irvine.oeis.a064;

import irvine.oeis.PartialSumSequence;

/**
 * A064406 Partial sums of A064405.
 * @author Sean A. Irvine
 */
public class A064406 extends PartialSumSequence {

  /** Construct the sequence. */
  public A064406() {
    super(1, new A064405());
  }
}

