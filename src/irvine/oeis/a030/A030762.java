package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030762 Positions of records in <code>A030757</code>.
 * @author Sean A. Irvine
 */
public class A030762 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030762() {
    super(new A030757(), 1);
  }
}
