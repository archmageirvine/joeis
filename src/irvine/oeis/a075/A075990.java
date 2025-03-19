package irvine.oeis.a075;

import irvine.oeis.RecordPositionSequence;

/**
 * A075990 Positions of records in A075988.
 * @author Sean A. Irvine
 */
public class A075990 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A075990() {
    super(new A075988(), 1);
  }
}
