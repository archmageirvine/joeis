package irvine.oeis.a051;

import irvine.oeis.RecordPositionSequence;

/**
 * A051650 Lonely numbers: distance to closest prime sets a new record.
 * @author Sean A. Irvine
 */
public class A051650 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A051650() {
    super(new A051700(), 0);
  }
}
