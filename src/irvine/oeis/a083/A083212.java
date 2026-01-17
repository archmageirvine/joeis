package irvine.oeis.a083;

import irvine.oeis.RecordPositionSequence;

/**
 * A083212 Where records occur in A083206.
 * @author Sean A. Irvine
 */
public class A083212 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A083212() {
    super(1, new A083206(), 1);
  }
}
