package irvine.oeis.a053;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a052.A052344;

/**
 * A053587 Indices of A052344 (ways to write n as sum of two nonzero triangular numbers) where record values are reached.
 * @author Sean A. Irvine
 */
public class A053587 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A053587() {
    super(1, new A052344(), 0);
    next(); // skip 0
  }
}
