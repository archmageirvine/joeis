package irvine.oeis.a002;

import irvine.oeis.PartialSumSequence;

/**
 * A002049 Prime numbers of measurement.
 * @author Sean A. Irvine
 */
public class A002049 extends PartialSumSequence {

  /** Construct the sequence. */
  public A002049() {
    super(1, new A002048());
  }
}
