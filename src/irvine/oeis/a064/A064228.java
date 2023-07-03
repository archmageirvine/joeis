package irvine.oeis.a064;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a057.A057167;

/**
 * A064228 From Recam\u00e1n's sequence (A005132): values of n achieving records in A057167.
 * @author Sean A. Irvine
 */
public class A064228 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A064228() {
    super(1, new A057167(), 0);
  }
}
