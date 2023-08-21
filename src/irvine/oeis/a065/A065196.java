package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065196 Indices of record entries (A065195) in A065194.
 * @author Sean A. Irvine
 */
public class A065196 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065196() {
    super(1, new A065194(), 1);
  }
}
