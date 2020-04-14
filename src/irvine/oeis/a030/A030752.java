package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030752 Positions of record values in <code>A030747</code>.
 * @author Sean A. Irvine
 */
public class A030752 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030752() {
    super(new A030747(), 1);
  }
}
