package irvine.oeis.a064;

import irvine.oeis.RecordPositionSequence;

/**
 * A064833 Indices of record numbers in A064791.
 * @author Sean A. Irvine
 */
public class A064833 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A064833() {
    super(1, new A064791(), 1);
  }
}
