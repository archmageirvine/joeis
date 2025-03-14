package irvine.oeis.a075;

import irvine.oeis.RecordPositionSequence;

/**
 * A075991 Indices where record values of A075989 occur.
 * @author Sean A. Irvine
 */
public class A075991 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A075991() {
    super(new A075989(), 1);
  }
}
