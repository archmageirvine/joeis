package irvine.oeis.a036;

import irvine.oeis.RecordPositionSequence;

/**
 * A036432 Sets a record for the number of positive integers which, when added to the number of their divisors, gives n.
 * @author Sean A. Irvine
 */
public class A036432 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A036432() {
    super(new A036431(), 1);
  }
}
