package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065193 Indices of record entries (A065192) in A065191.
 * @author Sean A. Irvine
 */
public class A065193 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065193() {
    super(1, new A065191(), 1);
  }
}
