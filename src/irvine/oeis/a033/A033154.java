package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;

/**
 * A033154 Position of incrementally largest terms in continued fraction for Niven's constant.
 * @author Sean A. Irvine
 */
public class A033154 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033154() {
    super(new A033151(), 1);
  }
}
