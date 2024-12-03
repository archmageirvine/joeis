package irvine.oeis.a073;

import irvine.oeis.RecordPositionSequence;

/**
 * A073528 n at which A073524(n) sets a new record.
 * @author Sean A. Irvine
 */
public class A073528 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A073528() {
    super(1, new A073524(), 1);
  }
}
