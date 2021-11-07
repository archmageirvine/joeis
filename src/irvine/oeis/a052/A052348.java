package irvine.oeis.a052;

import irvine.oeis.RecordPositionSequence;

/**
 * A052348 Indices of A052343 (ways to write n as sum of two triangular numbers) where record values are reached.
 * @author Sean A. Irvine
 */
public class A052348 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A052348() {
    super(new A052343(), 0);
  }
}
