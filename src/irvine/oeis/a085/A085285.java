package irvine.oeis.a085;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a072.A072340;

/**
 * A085285 Positions where records occur in A072340.
 * @author Sean A. Irvine
 */
public class A085285 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A085285() {
    super(1, 3, new A072340());
  }
}
