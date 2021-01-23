package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030742 Positions of record values in A030737.
 * @author Sean A. Irvine
 */
public class A030742 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030742() {
    super(new A030737(), 1);
  }
}
