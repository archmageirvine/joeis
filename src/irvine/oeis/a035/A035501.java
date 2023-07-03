package irvine.oeis.a035;

import irvine.oeis.RecordPositionSequence;

/**
 * A035501 Shuffles at which new record high cards appear on top of deck in Guy's shuffling problem A035485.
 * @author Sean A. Irvine
 */
public class A035501 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A035501() {
    super(1, new A035485(), 0);
  }
}

