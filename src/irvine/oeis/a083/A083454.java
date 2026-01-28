package irvine.oeis.a083;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a084.A084841;

/**
 * A083454 Positions of records in A084841.
 * @author Sean A. Irvine
 */
public class A083454 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A083454() {
    super(1, 1, new A084841());
  }
}
