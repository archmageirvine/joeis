package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030742 Positions of record values in <code>A030737</code>.
 * @author Sean A. Irvine
 */
public class A030742 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030742() {
    super(new A030737(), 1);
  }
}
